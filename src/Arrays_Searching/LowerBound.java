package Arrays_Searching;

public class LowerBound {
    public static void main(String[] args) {
//        int[] nums = {1,2,2,3};
//        int x = 2;

        int[] nums = {3,5,8,15,19};
        int x = 9;
        System.out.println(lowerBound(nums,x));
    }

    public static int lowerBound(int[] nums, int x) {

        int n = nums.length;

        // using the linear search algorithm.
        /*
        for(int i=0; i<n; i++) {
            if(nums[i]==x || nums[i]>x ) {
                return i;
            }
        }

        return n;
        */

        // Using the Binary Search.
        int start = 0;
        int end = n-1;

        int ans = n;

        while(start<=end) {
            int mid = start+(end-start)/2;

            if(nums[mid]>=x) {
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return ans;
    }
}
