package DS_Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        ArrayCreator players = new ArrayCreator(5);

        players.add("Tom");
        players.add("Jack");
        players.add("Seth");
        players.add("Bob");
        players.add("Frank");

        System.out.println("\n\nBefore modifications");
        players.display();

        System.out.println("\n\nCommitting modifications");
        players.find("Seth");


        System.out.println("\n\nDeleting a value");
        players.delete("Tommy");


        System.out.println("\n\nAfter modifications");
        players.display();
    }


}
