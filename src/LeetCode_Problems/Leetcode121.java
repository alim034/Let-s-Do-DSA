package LeetCode_Problems;

public class Leetcode121 {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};

        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] nums) {

        int n = nums.length;

        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            if(buyPrice<nums[i]) {
                int profit = nums[i]-buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = nums[i];
            }
        }

        return maxProfit;
    }
}
