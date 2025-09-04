package Arrays_Searching;

public class Leetcode941 {
    public static void main(String[] args) {

//        int[] nums = {2,1};
//        int[] nums = {3,5,5};
        int[] nums = {0,3,2,1};
        System.out.println(validMountainArray(nums));
    }

    public static boolean validMountainArray(int[] nums) {
        int n = nums.length;

        // if the length of the array is less than 3 then false.
        if(n<3) {
            return false;
        }

        // First Find Out the Maximum Element.
        int max =  0;
        int index = 0;
        for(int i=0; i<n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        // check if the max found at 0 or the last index, then also false.
        // beacuse if max found at 0 index then the remaining is smaller than first
        // and it is not mountain.
        // if the max found at last index then teh reaming which is occur before the last
        // is smaller element hence also not the mountain array.
        if(index==0 || index==n-1) {
            return false;
        }

        // check the element before teh peak element
        // if the element is strictly smaller than the peak then true
        // otherwise false.
        for(int i=1; i<=index; i++) {
            if(nums[i]>nums[i-1]) {
                continue;
            } else {
                return false;
            }
        }

        // check the element after teh peak element
        // if the element is strictly smaller than or decreasing the peak then true
        // otherwise false.
        for(int i=index; i<n-1; i++) {
            if(nums[i]>nums[i+1]) {
                continue;
            } else {
                return false;
            }
        }


        // return true
        return true;
    }
}
