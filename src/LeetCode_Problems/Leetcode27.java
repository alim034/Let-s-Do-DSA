package LeetCode_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

//        int[] nums = {0,1,2,2,3,0,4,2};
//        int val = 2;

        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {

        // 1st Approach:
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int i=0; i<nums.length; i++) {
//            if(nums[i] != val) {
//                list.add(nums[i]);
//            }
//        }
//
//       for(int i=0; i< list.size(); i++) {
//           nums[i] = list.get(i);
//       }
//
//       return list.size();

        // Two Pointer Appraoch
        int i=0;
        for(int j=0; j< nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
