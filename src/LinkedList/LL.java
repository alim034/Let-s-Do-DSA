package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // 1,2,3,4,5,6
    // 3
    // Insert Element at First
    public void insertFirst (int value) {
        Node node = new Node(value); // node == temp
        node.next = head;
        head = node;

        if (tail == null ) {
            tail =head;
        } // 1 elem 25
        size += 1;
    }


    // Display Method
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("End");
    }

    public void insertLast(int value) {
        if (tail==null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size ++;
    }

    // Insert at any Place
    public void insert(int val, int index) {

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i=0; i<index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // delete first element
    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;

        return val;
    }

    // delete Last
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // delete from particular point
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size) {
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    // 1 -> 2 -> 3 -> 4 -> 5 -> index target-find value at 3 postion
    // 343, 343 , 454, 4545, 4566 // linkedList

    // Searching Particular Element
    public Node findValue(int val) {
        Node temp = head; // temp node
        // complete list travels
        while (temp!=null) {
            if (temp.value == val) {
                return temp; // value
            }
            temp = temp.next; // i++
        }

        return null;
    }

    public Node get(int index) {
        Node node = head;

        for (int i=0; i<index; i++) {
            node = node.next;
        }

        return node;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
