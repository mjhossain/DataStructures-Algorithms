package SelectionSort;

public class SelectionSort {
    public static int[] arr = {99, 0,10,5,16,12,25,6,18,90,55};
    public static int nElems = arr.length;

    public static void main(String[] args) {
        display();
        selectionSort();
        display();
    }

    public static void selectionSort() {
        int out, in, min;

        for(out = 0; out < nElems-1; out ++){
            min = out;
            for(in = out+1; in<nElems; in++){
                if(arr[in] < arr[min]){
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    public static void swap(int x, int y) {

        System.out.println("Performing Swap on: " + arr[x] +", " + arr[y]);
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        //display();
    }

    public static void display() {
        System.out.println("\nDisplay");
        for (int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n");
    }
}
