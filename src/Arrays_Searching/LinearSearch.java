package Arrays_Searching;

import java.util.Scanner;

public class LinearSearch {

    // Function for the Linear Search Algo.
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


    // Function for the Linear Search In Range
    public static int searchInRange(int[] nums,int target, int startRange, int endRange) {
        int n = nums.length;

        if (n==0) {
            return -1;
        }

        for (int i=startRange; i<endRange; i++) {
            if (nums[i]==target) {
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

        // Search in Range
        int[] nums1 = {1,23,45,75,-3,-55,5,0,5,3,2,88,-90};
        int target1 = -3;
        int startRange = 1;
        int endRange = 5;

        int ans1 = searchInRange(nums1,target1,startRange,endRange);

        if (ans1==-1) {
            System.out.println("Element " + target +" is Not Found!!!!!");
        } else {
            System.out.println("Element " + target + " is Found at Index: " + ans1);
        }
    }
}
