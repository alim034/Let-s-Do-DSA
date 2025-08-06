package Arrays_2D;

public class Leetcode867 {

    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] ans = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }

    public static void printMatrix(int[][] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matrix Before Transpose: ");
        printMatrix(matrix);

        int[][] ans = transpose(matrix);

        System.out.println("Matrix After Transpose: ");
        printMatrix(matrix);
    }
}
