package Arrays_Searching;

public class Leetcode33 {
    public static void main(String[] args) {

//        int[] nums = {4,5,6,7,0,1,2};
//        int target = 0;

//        int[] nums = {4,5,6,7,0,1,2};
//        int target = 3;

        int[] nums = {1};
        int target = 0;

        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if we did not find the pivot element. it means array is not sorted.
        if(pivot == -1) {
            // jsut do teh normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }

        // if we found the pivot element. then we have 2 asc array
        if (nums[pivot] == target) {
            return pivot;
        }

        if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1,nums.length-1);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while(start<=end) {
            int mid = start+(end-start)/2;

            if (target>nums[mid]) {
                start = mid+1;
            } else if(target<nums[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end) {
            int mid = start+(end-start)/2;

            // four cases
            // case 01:
            if(mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            }

            // case 02:
            if (mid>start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }

            // case 03 && 04:
            if(nums[mid] <= start) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return -1;
    }
}
