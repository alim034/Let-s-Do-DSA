package LeetCode_Problems;

import java.util.Arrays;

public class Leetcode905 {
    public static void main(String[] args) {

//        int[] nums = {3,1,2,4};
//        int[] nums = {0};
        int[] nums = {1,2,3,4,5,6,7};
        int[] ans = sortArrayByParity(nums);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArrayByParity(int[] nums) {

        int n = nums.length;

        int left = 0;
        int right = n-1;

        while(left < right) {
            if(nums[left]%2!=0 && nums[right]%2==0) {
                swap(nums,left,right);
                left++;
                right--;
            }
            if(nums[left]%2==0) {
                left++;
            }
            if(nums[right]%2!=0) {
                right--;
            }
        }

        return nums;
    }

    public static void swap(int[] nums, int start, int end) {

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
