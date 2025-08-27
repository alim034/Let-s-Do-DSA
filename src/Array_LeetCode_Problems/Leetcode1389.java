package Array_LeetCode_Problems;

import java.util.ArrayList;

public class Leetcode1389 {

    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] target = createTargetArray(nums, index);

        for(int i: target) {
            System.out.print(i + " ");
        }

    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        // Step1: Create the new ArrayList & add the array element in it
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i< nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        // Step2: Create new array and add list element in it
        int[] target = new int[nums.length];

        for(int i=0; i< nums.length; i++) {
            target[i] = list.get(i);
        }

        return target;
    }
}
