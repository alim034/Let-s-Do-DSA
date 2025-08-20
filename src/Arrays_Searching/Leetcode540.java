package Arrays_Searching;

public class Leetcode540 {
    public static void main(String[] args) {

        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {

        int n = nums.length;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i]==nums[j]) {
                    nums[i] = -1;
                    nums[j] = -1;
                }
            }
        }

        int ans = -1;
        for(int i=0; i<n; i++) {
            if(nums[i] != -1) {
                ans = nums[i];
            }
        }

        return ans;
    }
}
