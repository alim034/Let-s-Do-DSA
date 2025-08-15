package Arrays_Searching;

public class FloorOfNumber {

    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
//        int target = 14;
        int target = 15;

        System.out.println(floorNumber(nums,target));
    }

    // Floor of Number:
    // Greatest Element in the Array smaller than or equal to target Element.
    public static int floorNumber(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start+(end-start)/2;

            if(target > nums[mid]) {
                start = mid+1;
            } else if(target < nums[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }

        return end;
    }
}
