package BubbleSort;

public class BubbleSort {
    public static int[] arr = {99, 0,10,5,16,12,25,6,18,90,55};
    public static int nElems = arr.length;

    public static void main(String[] args) {
        display();
        bubbleSort();
        display();
    }

    public static void bubbleSort() {
        int out, in;
        for(out = nElems-1; out > 1; out--) {
            for(in = 0; in < out; in++) {
                if(arr[in] > arr[in+1]){
                    swap(in, in+1);
                }
            }
            display();
        }
    }

    public static void swap(int x, int y) {

        System.out.println("Performing Swap on: " + arr[x] +", " + arr[y]);
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void display() {
        System.out.println("\nDisplay");
        for (int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n");
    }
}
