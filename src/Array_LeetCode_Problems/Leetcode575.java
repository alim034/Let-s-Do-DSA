package Array_LeetCode_Problems;

import java.util.Arrays;

public class Leetcode575 {

    public static void main(String[] args) {
//        int[] nums = {1,1,2,2,3,3};
//        int[] nums = {1,1,2,3};
        int[] nums = {6,6,6,6,6};

        System.out.println(distributeCandies(nums));
    }

    public static int distributeCandies(int[] nums) {

        int n = nums.length;

        int lengthCount = n/2;

        int distinctCount = numOfDistinct(nums);

        if(distinctCount < lengthCount) {
            return distinctCount;
        }

        return lengthCount;
    }

    public static int numOfDistinct(int[] nums) {

        int n = nums.length;

        Arrays.sort(nums);
        int count = 1;

        if(n == 0) {
            return 0;
        }

        for(int i=1; i<n; i++) {
            if(nums[i] != nums[i-1]) {
                count++;
            }
        }

        return count;
    }
}
