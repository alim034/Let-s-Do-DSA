package Searing_in_2D_Arrays;

import java.util.Arrays;

public class Leetcode74 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 3;

        // using the boolean function
        System.out.println(searchMatrix(matrix, target));

        // return the index values
        int[] ans = searchMatrixIndex(matrix,target);
        System.out.println(Arrays.toString(ans));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while(r<matrix.length && c>=0) {

            if(matrix[r][c] == target) {
                return true;
            } else if(matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return false;
    }


    // This Function return the index of that target element if found
    // otherwise return the -1,-1.
    public static int[] searchMatrixIndex(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while (r<matrix.length && c>=0) {
            if(matrix[r][c] == target) {
                return new int[]{r,c};
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[] {-1,-1};
    }
}
