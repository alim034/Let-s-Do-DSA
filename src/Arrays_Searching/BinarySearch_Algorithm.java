package Arrays_Searching;

public class BinarySearch_Algorithm {

    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12,14,16,18,20};
        int target = 10;

        int ans = binarySearch(nums,target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            // Find the Middle Elements
            int mid = start+(end-start)/2;

            if(target< nums[mid]) {
                end = mid-1;
            } else if(target > nums[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
