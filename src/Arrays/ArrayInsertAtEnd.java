package Arrays;

import java.util.ArrayList;

public class ArrayInsertAtEnd {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        int val = 90;

        System.out.println("Array Before Adding Last Element");
        System.out.println(arr);

        System.out.println("Array After Adding Last Element");
        insertAtEnd(arr, val);
    }

    public static void insertAtEnd(ArrayList<Integer> arr, int val) {
        // code here

        int size = arr.size();

        arr.add(val);

       System.out.println(arr);

    }
}
