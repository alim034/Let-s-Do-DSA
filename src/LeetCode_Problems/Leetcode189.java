package LeetCode_Problems;

public class Leetcode189 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 2;

        System.out.println("Array Before Rotate");
        for(int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        rotate(arr, k);
        System.out.println("Array After Rotate");
        for(int num: arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;

        k %= len;

        reverse(nums, 0, len-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, len-1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
