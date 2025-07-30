package Arrays;

import java.util.Arrays;

public class DistinctElements {
    public static void main(String[] args) {
//        int[] nums = {1,1,1,2,2,3,3,3,4,4};
//        int[] nums = {1,2,3,4,5,6,7};
        int[] nums = {};

        System.out.println(distinctElement(nums));
    }

    public static int distinctElement(int[] nums) {

        int n = nums.length;

        // Step1: sort the given array
        Arrays.sort(nums);

        // Step2: Take counter Variable
        int count = 1;

        // Take care of condition like: if length is zero
        if(n==0) {
            return 0;
        }

        // Condition
        for(int i=1; i<n; i++) {
            if(nums[i] != nums[i-1]) {
                count++;
            }
        }

        return count;
    }
}
