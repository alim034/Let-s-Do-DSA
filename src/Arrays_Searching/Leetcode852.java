package Arrays_Searching;

public class Leetcode852 {

    public static void main(String[] args) {

//        int[] nums = {0,2,1,0};
        int[] nums = {0,1,0};
        System.out.println(peakIndexInMountainArray(nums));
    }

    public static int peakIndexInMountainArray(int[] nums) {

        int n = nums.length;

        // Brute force Approach
//        int midIndex = 0;
//        int maxValue = 0;
//
//        for(int i=0; i<n; i++) {
//            if(nums[i] > midIndex) {
//                midIndex = nums[i];
//                maxValue = i;
//            }
//        }
//
//        return maxValue;

        // Optimal Appraoch
        // Using Binary Search
        int start = 0;
        int end = n-1;

        while(start<end) {
            int mid = start+(end-start)/2;

            if(nums[mid] > nums[mid+1]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }

        return start; // or return end
    }
}
