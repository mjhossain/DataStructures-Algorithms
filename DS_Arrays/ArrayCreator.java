package DS_Arrays;

public class ArrayCreator {
    private String[] arr;
    private int numOfElements;

    public ArrayCreator(int size) {
        arr = new String[size];
        numOfElements = 0;
    }

    // To insert a value in the array
    public void add(String value) {
        arr[numOfElements] = value;
        numOfElements++;
    }

    // To find a value in the array
    public void find(String value) {
        int i;
        for(i = 0; i < numOfElements; i++) {
            if(arr[i].equals(value)) {
                break;
            }
        }

        if(i == numOfElements) {
            System.out.println(value + " not found!");
        } else {
            System.out.println(value + " found!");
        }
    }

    // To delete a value in the array
    public void delete(String value) {
        int i;
        for (i = 0; i < numOfElements ; i++) {
            if(value.equals(arr[i])) {
                break;
            }
        }

        if(i == numOfElements) {
            System.out.println(value + " not found!");
        } else {
            for(int j = i; j < numOfElements - 1; j++) {
                arr[j] = arr[j + 1];
            }
            System.out.println(value + " deleted!");
            numOfElements--;

        }

    }

    // To display the array
    public void display() {
        for (int i = 0; i < numOfElements; i++) {
            System.out.println(arr[i]);
        }
    }

} // End of Class
