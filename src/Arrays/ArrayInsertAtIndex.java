package Arrays;

import java.util.ArrayList;

public class ArrayInsertAtIndex {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayInsertAtIndex aiat = new ArrayInsertAtIndex();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println("Array Before Adding the Element at Index");
        System.out.println(arr);

        System.out.println("Array After Adding the Element at Index");
        aiat.insertAtIndex(arr,2,90);
    }

    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        // code here

        arr.add(index, val);

        System.out.println(arr);
    }
}
