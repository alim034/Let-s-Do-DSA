//  Program to find the last occurrence of element x in a given array
package Arrays;

public class ElementLastOccurance {

    public static void main(String[] args) {
        int[] nums = {1,2,6,5,4,4,3,5};
        int target = 5;

        System.out.println(lastOccurace(nums, target));
    }

    public static int lastOccurace(int[] nums, int target) {

        int n = nums.length;

        int lastIndex = 0;
        for(int i=0; i<n; i++) {
//            occur = 0;
            if(nums[i]==target) {
                lastIndex = i;
            }
        }


        return lastIndex;
    }
}
