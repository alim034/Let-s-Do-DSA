package Arrays_Searching;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] nums, int target) {

        int n = nums.length;

        if(n==0) {
            return -1;
        }

        for(int i=0; i<n; i++) {
            if(nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,23,45,75,-3,-55,5,0};
//        int target = 8;
//        int target = -55;
        int target = 89;

        int ans = linearSearch(nums,target);

        if (ans==-1) {
            System.out.println("Element " + target +" is Not Found!!!!!");
        } else {
            System.out.println("Element " + target + " is Found at Index: " + ans);
        }
    }
}
