package Arrays_2D;

public class Leetcode48 {

    public static void transposInPlace(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i=0; i<c; i++) {
            for(int j=i; j<r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverse(int[] nums) {
        int i =  0;
        int j = nums.length-1;

        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static void rotate(int[][] matrix) {
       // Step01: Transpose of given
        // Step02: Reverse each row of transpose

        transposInPlace(matrix);

        int n = matrix[0].length;
        // Basically we reverse the 1D array , because each row of the
        // 2D Array is also 1D array.
        for(int i=0; i<n; i++) {
            reverse(matrix[i]);
        }
    }

    // Method to Print the Matrix
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
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

        rotate(matrix);

        System.out.println("Matrix After Transpose: ");
        printMatrix(matrix);
    }
}
