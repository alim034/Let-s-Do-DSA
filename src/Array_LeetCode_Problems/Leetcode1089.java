package Array_LeetCode_Problems;

public class Leetcode1089 {
    public static void main(String[] args) {
        int[] nums = {1,0,2,3,0,4,5,0};

        duplicateZeros(nums);
    }

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n-1; i++) {
            if(arr[i] == 0) {
                for(int j=n-2; j>=i; j--) {
                    arr[j+1] = arr[j];
                }
                i++;
            }
        }
    }
}
