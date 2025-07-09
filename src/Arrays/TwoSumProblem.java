package Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {

        int[] nums = {2,4,11,15};
        int target = 9;

        int[] ans = twoSum(nums, target);

        for(int i: ans) {
            System.out.print(i+ " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i]+nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
