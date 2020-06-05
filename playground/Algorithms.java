package playground;

public class Algorithms {
    public static int[] arr = {1,4,2,6,8,3,5,9,7,0};
    public static int nElems = arr.length;

    public static void main(String[] args) {
        displayArr();
        bubbleSort();
        displayArr();
    }

//    Bubble Sort implemented
    public static void bubbleSort() {
        int out, in;
        for(out = nElems - 1; out > 0; out--) {
            for(in = 0; in < out; in++) {
                if(arr[in] > arr[in+1]) {
                    swap(in, in+1);
                }
            }
        }
    }

    public static void displayArr() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void swap(int x, int y) {
        System.out.println("Performing swap " + arr[x] + " & " + arr[y]);
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }


}
