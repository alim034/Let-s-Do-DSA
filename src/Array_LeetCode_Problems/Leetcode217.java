package Array_LeetCode_Problems;

import java.util.Arrays;

public class Leetcode217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
//        int[] nums = {1,2,3,4,5,6};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        int n = nums.length;

        // approach-01:
//        for(int i=0; i<n; i++) {
//            for(int j=i+1; j<n; j++) {
//                if(nums[i]==nums[j]) {
//                    return true;
//                }
//            }
//        }

        // approach-02
        Arrays.sort(nums);
        for(int i=1; i<n; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }

        return false;
    }
}
