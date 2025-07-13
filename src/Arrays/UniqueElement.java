// Find the Unique number is given array, where all the element are being
// repated twice with one value being unique

package Arrays;

public class UniqueElement {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,2,1,3};

        System.out.println(uniqueElement(nums));
    }

    public static int uniqueElement(int[] nums) {

        int n = nums.length;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i] == nums[j]) {
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
