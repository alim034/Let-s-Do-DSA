package Array_LeetCode_Problems;

public class Leetcode1480 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        int[] arr = {1,1,1,1,1};
        int[] arr = {3,1,2,10,1};

        int[] arr1 = runningSum(arr);

        for(int i: arr1) {
            System.out.print(i + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;

        for(int i=1; i<n; i++) {
            nums[i] = nums[i]+nums[i-1];
        }

        return nums;
    }
}
