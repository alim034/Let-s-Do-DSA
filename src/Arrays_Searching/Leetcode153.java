package Arrays_Searching;
import java.util.Arrays;

public class Leetcode153 {

    public static void main(String[] args) {

//        int[] nums = {3,4,5,1,2};
        int[] nums = {4,5,6,7,0,1,2};
        int ans = findMin(nums);

        System.out.println(ans);
    }

    public static int findMin(int[] nums) {
        int n = nums.length;

        // Approach 01:
//        int min = nums[0];
//        for(int i=0; i<n; i++) {
//            if(nums[i] < min) {
//                min = nums[i];
//            }
//        }

        // Approach 02:
        Arrays.sort(nums);
        int min1 = nums[0];

        return min1;
    }
}
