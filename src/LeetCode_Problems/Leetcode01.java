// Link: https://leetcode.com/problems/two-sum/description/
package LeetCode_Problems;

public class Leetcode01 {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] ans = twoSum(nums, target);

        for(int i: ans) {
            System.out.print(i+ " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        int[] indices = new int[2];

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i]+nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }

        return indices;
    }
}
