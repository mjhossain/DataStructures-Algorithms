package LinkedListP;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList ourList = new LinkList();

        ourList.insertFirst(10);
        ourList.insertFirst(20);
        ourList.insertFirst(30);
        ourList.insertFirst(40);
        ourList.insertFirst(50);

        ourList.displayList();

        ourList.deleteFirst();
        ourList.deleteFirst();

        Link f = ourList.find(50);

        if(f != null) {
            System.out.println("Found the Link! " + f.data);
        } else {
            System.out.println("Sorry not found!");
        }

    }
}
