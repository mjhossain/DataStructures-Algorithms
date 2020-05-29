package BinarySearchDemo;

public class BinarySearchDemo {

    static int steps = 0;

    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 1; i <= 100; i++) {
            a[i-1] = i;
        }
        int searchKey = 43;
        int foundKey = find(searchKey, a);

        System.out.println("Found Key: " + foundKey + "\nSteps: " + steps);
    }

    public static int find(int key, int[] a) {
        int nElems = a.length;
        int lowBound = 0;
        int upBound = nElems - 1;

        int curIn;

        while (true) {
            steps++;
            curIn = (lowBound + upBound) / 2;
            System.out.println("Step: " + steps
                                +"\nUpper Bound: " + upBound
                                +"\nLower Bound: " + lowBound
                                +"\nCurrent Index: " + curIn
                                +"\nValue in Index: " + a[curIn]
                                + "\n\n");
            if(a[curIn] == key) {
                return a[curIn];
            } else if (lowBound > upBound) {
                return nElems;
            } else {
                if(a[curIn] < key) {
                    lowBound = curIn + 1;
                } else {
                    upBound = curIn - 1;
                }
            }

        }
    }
}
