package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(3);
        list.insertFirst(34);
        list.insertFirst(3);

//        list.display();

        list.insertLast(55);
        list.insertLast(45);

//        list.display();

        list.insert(880,4);
        list.display();

//        list.deleteFirst();
//        list.display();

//        list.deleteLast();
//        list.display();

        list.delete(4);
        list.display();
    }
}
