package LinkedListP;

public class Link {
    public int data;
    public Link next;

    public Link(int data) {
        this.data = data;
    }

    public void displayData() {
        System.out.println("The data of this Link is: " + data);
    }
}
