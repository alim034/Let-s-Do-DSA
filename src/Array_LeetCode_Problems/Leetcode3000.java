package Array_LeetCode_Problems;

public class Leetcode3000 {
    public static void main(String[] args) {
        int[][] dimensions = {{9,3}, {8,6}};

        System.out.println(areaOfMaxDiagonal(dimensions));
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {

        double maxDiagonal = 0;
        int maxArea = 0;

        for(int i=0; i<dimensions.length; i++) {

            int l = dimensions[i][0];
            int w = dimensions[i][1];

            double diagonal = l*l + w*w;
            int area = l*w;

            if(diagonal>maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if(diagonal==maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
