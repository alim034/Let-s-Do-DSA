package Sorting;

import java.util.Arrays;

public class Leetcode628 {
    public static void main(String[] args) {
//        int[] nums = {4,3,2,2};
//        int[] nums = {1,2,3};
        int[] nums = {-1,-2,-3};
//        int[] nums = {-100, -98, -1, 2,3,4};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("=================");

        int ans = 1;
//        ans = (n)*(n-1)*(n-2);

        // for the array which contain negative number
        if(hasNegative(nums)) {
            ans = nums[0]*nums[1]*nums[n-1];
        } else {
            // For the positive Numbers
            for(int i=n-3; i<n; i++) {
                ans *= nums[i];
            }
        }

        return ans;
    }

    public static boolean hasNegative(int[] nums) {

        for(int num: nums) {
            if(num<0) {
                return true;
            }
        }

        return false;
    }
}
