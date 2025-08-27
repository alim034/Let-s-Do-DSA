package Array_LeetCode_Problems;

public class Leetcode1493 {
    public static void main(String[] args) {

//        int[] nums = {1,1,0,1};
//        System.out.println(longestSubArray(nums));

//        int[] nums = {1,1,1};
//        System.out.println(longestSubArray(nums));

        int[] nums = {1,1,1};
        System.out.println(longestSubarray(nums));
    }

    /*==============================================================*/
    /*
    public static int longestSubArray(int[] nums) {
        int n = nums.length;

        // Brute Force Approach
        int result = 0;

        // variable to track the count of the zero.
        int zeroCount = 0;

        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                zeroCount++;
                result = Math.max(result, findMax(nums, i));
            }
        }

        if (zeroCount == 0) {
            return n-1;
        }

        return result;
    }

    public static int findMax(int[] nums, int skipIndex) {

        int currentLength = 0;
        int maxLength = 0;


        for(int i=0; i<nums.length; i++) {

            if(i==skipIndex) {
                continue;
            }

            if(nums[i] == 1) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }

        return maxLength;
    }
    */
    /*==============================================================*/


    public static int longestSubarray(int[] nums) {

        int n = nums.length;

        int result = 0;
        int zeroCount = 0;

        int i=0;
        for(int j=0; j<n; j++) {
            if(nums[j]==0) {
                zeroCount++;
            }

            while(zeroCount>1) {
                if (nums[i]==0) {
                    zeroCount--;
                }
                i++;
            }

            result = Math.max(result, j-i);
        }

        return result;
    }
}
