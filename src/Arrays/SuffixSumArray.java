package Arrays;
import java.util.Arrays;

public class SuffixSumArray {
    public static void main(String[] args) {

        int[] nums = {2,5,6,1,3};

        int[] ans = suffixSum(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static int[] suffixSum(int[] nums) {

        int n = nums.length;

        for(int i=n-2; i>=0; i--) {
            nums[i] = nums[i]+nums[i+1];
        }

        return nums;
    }
}
