// Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
package LeetCode_Problems;

public class Leetcode26 {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3,4,4};

        int j = removeDuplicate(arr);
        for(int i=0; i<j; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
