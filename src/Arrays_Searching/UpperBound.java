package Arrays_Searching;

public class UpperBound {
    public static void main(String[] args) {
//        int[] nums = {1,2,2,3};
//        int x = 2;

        int[] nums = {3,5,8,15,19};
        int x = 9;

        System.out.println(upperBound(nums,x));
    }

    public static int upperBound(int[] nums, int x) {
        int n = nums.length;

        // using the linear search
        /*
        for(int i=0; i<n; i++) {
            if(nums[i]>x) {
                return i;
            }
        }

        return n;
        */

        // using the binary search
        int start = 0;
        int end = n-1;

        int ans = n;

        while (start<=end) {
            int mid = start+(end-start)/2;

            if(nums[mid]>x) {
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return ans;
    }
}
