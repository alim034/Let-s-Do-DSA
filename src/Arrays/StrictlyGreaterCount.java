// Program to count the number of elements strictly greater than a value x
package Arrays;

public class StrictlyGreaterCount {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,5,4,4,5};
        int target = 2;

        System.out.println(strictlyGreater(nums, target));
    }

    public static int strictlyGreater(int[] nums, int target) {

        int n = nums.length;

        int count = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] > target) {
                count++;
            }
        }

        return count++;
    }
}
