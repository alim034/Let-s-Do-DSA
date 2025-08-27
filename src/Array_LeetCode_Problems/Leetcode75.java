package Array_LeetCode_Problems;

import java.util.Arrays;

public class Leetcode75 {
    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};

        System.out.println("Array Before Sorting: ");
        System.out.println(Arrays.toString(nums));

        sortColors(nums);

        System.out.println("Array After Sorting: ");
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {

        int n = nums.length;

        int zeros = 0;
        int ones = 0;

        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                zeros++;
            }
            if(nums[i] == 1) {
                ones++;
            }
        }

        for(int i=0; i<n; i++) {
            if(i<zeros) {
                nums[i] = 0;
            } else if(i < zeros+ones) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
