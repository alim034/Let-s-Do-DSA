package Arrays;

public class MaxSubArraySum_KadansAlgo {
    public static void main(String[] args) {

//        int[] nums = {-1,-2, 6, -1, 3};
//        int[] nums = {2, 4, 6, 8, 10};
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

//        int[] nums = {1};
//        int[] nums = {5,4,-1,7,8};
//        int[] nums = {-1};

        maxSubArraySum(nums);
    }

    public static void maxSubArraySum(int[] nums) {

        int n = nums.length;

        // CASE-I : FOR THE POSITIVE NUMBERS
//        int maxSum = Integer.MIN_VALUE;
//        int currSum = 0;
//        for(int i=0; i<n; i++) {
//            currSum = currSum+nums[i];
//
//            if(currSum<0) {
//                currSum = 0;
//            }
//
//            maxSum = Math.max(currSum, maxSum);
//        }

        // CAS-II : FOR THE NEGATIVE , POSITIVE NUMBERS
        int maxSum = nums[0];  // Important: initialize to first element
        int currSum = nums[0]; // Start from first element

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);  // Either start new subarray or extend
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Max Sub Array Sum: " + maxSum);
    }
}
