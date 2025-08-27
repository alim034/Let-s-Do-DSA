package Array_LeetCode_Problems;
import java.util.Arrays;

public class Leetcode977 {
    public static void main(String[] args) {

//        int[] nums = {-4,-1,0,3,10};
        int[] nums = {-7,-3,2,3,11};

       int[] ans = sortedSquares(nums);

       for(int i: ans) {
           System.out.print(i + " ");
       }
    }

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;

        for(int i=0; i<n; i++) {
            nums[i] = nums[i]*nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}
