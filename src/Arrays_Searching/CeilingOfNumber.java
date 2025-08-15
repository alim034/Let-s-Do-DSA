package Arrays_Searching;

public class CeilingOfNumber {

    public static void main(String[] args) {

        int[] nums = {2,3,5,9,14,16,18};
//        int target = 14;
//        int target = 15;
        int target = 19;

        System.out.println(ceiling(nums,target));
    }

    // Ceiling of Number:
    // Smallest Element in the Array Greater or Equal to Target element
    public static int ceiling(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(start<=end) {
            int mid = start+(end-start)/2;

            if(target > nums[mid]) {
                start = mid+1;
            } else if(target < nums[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }

        return start;
    }

}
