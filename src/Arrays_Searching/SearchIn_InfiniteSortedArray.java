package Arrays_Searching;

public class SearchIn_InfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(answer(arr, target));
    }

    static int answer(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while(target > nums[end]) {
            int temp = end+1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return binarySearch(nums,target,start,end);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {

        while(start <= end) {
            // find the middle element
           //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
