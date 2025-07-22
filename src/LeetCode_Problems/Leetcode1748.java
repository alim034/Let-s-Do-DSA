package LeetCode_Problems;

import java.util.Arrays;

public class Leetcode1748 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,2};
//        int[] nums = {1,2,3,4,5};
//        int[] nums = {1,1,1,1,1};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {

        int n = nums.length;

//        int temp = 0;
//
//        int sum = 0;
//
//
//        for(int i=0; i<n; i++) {
//            for(int j=i+1; j<n; j++) {
//                if(nums[i]==nums[j]) {
//                    temp = temp+nums[i];
//                }
//            }
//        }
//        System.out.println("temp: " + temp);
//
//        int tempSum = 0;
//        for(int i=0; i<n; i++) {
//            tempSum = tempSum+nums[i];
//        }
//        System.out.println("tempSum: " + tempSum);
//
//         sum = tempSum-temp*temp;
//
//        return sum;

        // Create the Frequency Array
        int[] freq = new int[101];


        for (int i : nums)
            freq[i]++;

        int sum = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }
}
