package Sorting;

import java.util.Arrays;

public class Leetcode1051 {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int count = 0;

        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        for(int i=0; i<heights.length; i++) {
            if(heights[i] != arr[i]) {
                count++;
            }
        }

        return count;
    }
}
