package Arrays;

public class MaxSubArraySum_bruteForce {

    public static void main(String[] args) {

//        int[] nums = {2, 4, 6, 8, 10};
//        int[] nums = {-1,-2, 6, -1, 3};
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {1};
//        int[] nums = {5,4,-1,7,8};
        int[] nums = {-1};

        maxSubArraySum(nums);
    }

    public static void maxSubArraySum(int[] nums) {

        int n = nums.length;

        int currSum = 0;
        int maxSum = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {

                currSum = 0;
                for(int k=i; k<=j; k++) {
                    currSum += nums[k];
                }

                // check for the maximum sum
                if(maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sub Array Sum is: " + maxSum);
    }
}
