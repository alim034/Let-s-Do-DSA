package LeetCode_Problems;

public class Leetcode42 {

    public static void main(String[] args) {
//        int[] height = {4,2,0,6,3,2,5};
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(height));
    }

    public static int trappingRainWater(int[] height) {

        int n = height.length;

        // Creating the leftMax - array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Creating the RightMax - array
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }


        int trappedWater = 0;
        for(int i=0; i<n; i++) {

            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterlevel - height[i];
        }

        return trappedWater;
    }
}
