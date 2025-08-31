package Sorting;

import java.util.*;

public class Leetcode414 {

    public static void main(String[] args) {
//        int[] nums = {3,2,1};
////        System.out.println(maximum(nums));
//        System.out.println(thirdMax(nums));

//        int[] nums = {1,2};
//        System.out.println(thirdMax(nums));

        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        int n = nums.length;

        Set<Integer> distinct = new HashSet<>();
        for(int i=0; i<n; i++) {
            distinct.add(nums[i]);
        }
        System.out.println(distinct);

        System.out.println("==============");

        List<Integer> list = new ArrayList<>(distinct);
        Collections.sort(list);
        System.out.println(list);

        int answer = 0;

        if(list.size()<3) {
            return maximum(nums);
        } else {
            answer = list.get(list.size()-3);
        }

        return answer;
    }

    public static int maximum(int[] nums) {
        int maxi = 0;

        for(int i=0; i<nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        return maxi;
    }
}
