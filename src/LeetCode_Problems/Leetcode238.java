package LeetCode_Problems;

public class Leetcode238 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
        int[] nums = {-1,1,0,-3,3};
        int[] ans = productExceptSelf(nums);

        for(int i: ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        // Brute Force Approach
//        int[] ans = new int[n];
//        for(int i=0; i<n; i++) {
//            int product = 1;
//            for(int j=0; j<n; j++) {
//                if(i != j) {
//                    product = product*nums[j];
//                }
//            }
//            ans[i] = product;
//        }


        // Optimal Approach
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int[] ans = new int[n];

        prefix[0] = 1;
        for(int i=1; i<n; i++) {
            prefix[i] = prefix[i-1]*nums[i-1];
        }

        postfix[n-1] = 1;
        for(int i=n-2; i>=0; i--) {
            postfix[i] = postfix[i+1]*nums[i+1];
        }

        for(int i=0; i<n; i++) {
            ans[i] = prefix[i]*postfix[i];
        }

        return ans;
    }
}
