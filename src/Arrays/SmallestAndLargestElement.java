// Program to Find the Maximum and Minimum Element in given Array and print those elements in the new array.
package Arrays;
import java.util.Arrays;

public class SmallestAndLargestElement {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,7,1,2,0,8};

        int[] ans = smallestandlargest(nums);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] smallestandlargest(int[] nums) {

        int n = nums.length;

        // Method01:
        int max = -1;
        int small = nums[0];

        for(int i=0; i<n; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
            if(nums[i] < small) {
                small = nums[i];
            }
        }

        int[] ans = new int[2];
        ans[0] = small;
        ans[1] = max;

        // Method02:
//        Arrays.sort(nums);
//        int[] ans = new int[2];
//
//        ans[0] = nums[0];
//        ans[1] = nums[n-1];

        return ans;
    }
}
