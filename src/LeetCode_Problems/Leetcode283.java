package LeetCode_Problems;

import java.util.ArrayList;

public class Leetcode283 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,6,7,8,9,0,0,0};
        movesZeros(arr);

        for(int n: arr) {
            System.out.print(n + " ");
        }
    }

    public static void movesZeros(int[] arr) {
        int len = arr.length;

        // Step1: add the all non-zero elements in the list
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<len; i++) {
            if(arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        // Step2: add list into original array
        int list_size = list.size();

        for (int i=0; i<list_size; i++) {
            arr[i] = list.get(i);
        }

        // Step#: assign 0 to remaining elements
        for(int i=list_size; i<len; i++) {
            arr[i] = 0;
        }
    }
}
