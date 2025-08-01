package Arrays;
import java.util.Arrays;

public class ZeroOneSorter {

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1,0,1,0,1,0,0,1,1};

        System.out.println("Array Before Sorting");
        System.out.println(Arrays.toString(nums));

        System.out.println("Array After Sorting");
        sorterMethod(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sorter(int[] nums) {

        int n = nums.length;

        // Step1: count num.of zeros
        int count = 0;
        for(int i=0; i<n; i++) {
            if(nums[i]==0) {
                count++;
            }
        }

        for(int i=0; i<n; i++) {
            if(i<count) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
    }

    public static void sorterMethod(int[] nums) {

        int n = nums.length;

        int left = 0;
        int right = n-1;

        while(left < right) {
            if(nums[left]==1 && nums[right]==0) {
                swap(nums, left, right);
                left++;
                right--;
            }
            if(nums[left]==0) {
                left++;
            }
            if(nums[right]==1) {
                right--;
            }
        }
    }

    // Helper Method
    public static void swap(int[] nums, int start, int end) {

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
