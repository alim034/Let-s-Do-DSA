package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};

//        int[] ans = bubble(nums);

        System.out.println("Array Before Sorting: ");
        System.out.println(Arrays.toString(nums));

        System.out.println("Array After Sorting: ");
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubble(int[] nums) {

        for(int i=0; i< nums.length; i++) {
            for(int j=1; j< nums.length-i; j++) {
                if(nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
}
