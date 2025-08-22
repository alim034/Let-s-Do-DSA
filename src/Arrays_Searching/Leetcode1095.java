package Arrays_Searching;

public class Leetcode1095 {
    public static void main(String[] args) {

        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(search(mountainArr,target));
    }

    public static int search(int[] nums, int target) {
        int peak = findPeackIndex(nums);

        int lefthafl = orderAgnosticBinarySearch(nums,target,0,peak);

        if(lefthafl != -1) {
            return lefthafl;
        }

        int righthalf = orderAgnosticBinarySearch(nums,target,peak+1,nums.length-1);

        return righthalf;
    }

    public static int findPeackIndex(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while (start<end) {
            int mid = start+(end-start)/2;

            if (nums[mid] > nums[mid+1]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }

        return start;
    }

    public static int orderAgnosticBinarySearch(int[] nums, int target, int start, int end) {
        boolean isAsc = nums[start] < nums[end];

        while (start < end) {
            int mid = start+(end-start)/2;

            if(nums[mid]==target) {
                return mid;
            }

            if(isAsc) {
                if(target>nums[mid]) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            } else {
                if(target<nums[mid]) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }

        return -1;
    }
}
