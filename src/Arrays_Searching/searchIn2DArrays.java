package Arrays_Searching;

import java.util.Arrays;

public class searchIn2DArrays {
    public static void main(String[] args) {

        int[][] nums = {
                {1,254,3,45,65},
                {98,54,23,857,9764},
                {9876,1,3,576,0},
                {12,45,876,45}
        };

        int target = 876;

        int[] ans = linearSearch(nums,target);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] linearSearch(int[][] nums, int target) {
        int n = nums.length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(nums[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
