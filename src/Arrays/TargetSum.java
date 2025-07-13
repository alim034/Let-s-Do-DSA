// Find the Number of Triplets whos sum equals to the target value.
package Arrays;

public class TargetSum {
    public static void main(String[] args) {

        int[] nums = {1,4,5,6,3};
        int target = 12;

        System.out.println(triplets(nums,target));
    }

    public static int triplets(int[] nums, int target) {

        int n = nums.length;

        int count = 0;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    if(nums[i]+nums[j]+nums[k] == target) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
