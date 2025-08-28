package Arrays_Searching;

public class Leetcode875 {

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println(minEatingSpeed(piles,h));
    }


    public static int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = maxElement(piles);

        while (start<=end) {
            int mid = start+(end-start)/2;

            int totalH = calTotalHours(piles, mid);

            if (totalH <= h) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return start;
    }

    // function to find the maximum in the array.
    public static int maxElement(int[] nums) {
        int maxi = Integer.MAX_VALUE;
        for(int i=0; i< nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        return maxi;
    }

    // Function to Calculate the Total Hours
    public static int calTotalHours(int[] nums, int hours) {
        int totalHour = 0;

        for(int i=0; i<nums.length; i++) {
            totalHour += Math.ceil((double)nums[i]/(double)hours);
        }

        return totalHour;
    }
}
