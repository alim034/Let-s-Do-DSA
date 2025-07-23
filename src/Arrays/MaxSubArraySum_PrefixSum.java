package Arrays;

public class MaxSubArraySum_PrefixSum {
    public static void main(String[] args) {

//        int[] nums = {-1,-2, 6, -1, 3};
//        int[] nums = {2, 4, 6, 8, 10};
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

//        int[] nums = {1};
        int[] nums = {5,4,-1,7,8};  // o/p: 23
//        int[] nums = {-1};

        maxSubArraySum(nums);
    }

    public static void maxSubArraySum(int[] nums) {

        int n = nums.length;

        // Create an prefixSum array
        int[] prefix = new int[n];

        prefix[0] = nums[0];
        for(int i=1; i<n; i++) {
            prefix[i] = prefix[i-1]+nums[i];
        }

        // Calculate the Max Sum of Sub Array
        int maxSum = 0;
        int currSum = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                currSum = i==0 ? prefix[j] :  prefix[j]-prefix[i-1];

                if(maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }


        System.out.println("Max Sub Array Sum is: " + maxSum);
    }

    public static int smallestNum(int[] nums) {
        int n= nums.length;

        int min = nums[0];
        for(int i=0; i<n; i++) {
            if(nums[i]<min) {
                min = nums[i];
            }
        }

        return min;
    }
}
