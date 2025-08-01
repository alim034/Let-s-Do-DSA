package LeetCode_Problems;
import java.util.Arrays;

public class Leetcode215 {

    public static void main(String[] args) {
//        int[] nums = {3,2,1,5,6,4};
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {

        int n = nums.length;

        Arrays.sort(nums);

        int kthLargest = nums[n-k];

        return kthLargest;
    }
}
