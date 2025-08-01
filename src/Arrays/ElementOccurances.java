// count the number of occurrences of element x in a given array
package Arrays;

public class ElementOccurances {

    public static void main(String[] args) {

        int[] nums = {5,6,5,1,5,4};
        int target = 10;

        System.out.println(occurances(nums, target));
    }

    public static int occurances(int[] nums, int target) {
        int n = nums.length;

        int count = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == target) {
                count++;
            }
        }

        return count;
    }
}
