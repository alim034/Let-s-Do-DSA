package Arrays_2D;

import java.util.List;
import java.util.Scanner;

public class Leetcode54 {

    public static void printMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function for the Spiral Matrix
    public static void spiralMatrix(int[][] matrix, int r, int c) {
        int topRow=0, bottomRow=r-1;
        int leftColumn=0, rightColumn=c-1;

        // total element
        int total_elements = 0;

        while(total_elements<r*c) {

            // Step01: Print Top Row
            for(int i=leftColumn; i<=rightColumn && total_elements<r*c; i++) {
                System.out.print(matrix[topRow][i] + " ");
                total_elements++;
            }
            topRow++;

            // Step02: Print Right Column
            for(int i=topRow; i<=bottomRow && total_elements<r*c; i++) {
                System.out.print(matrix[i][rightColumn] + " ");
                total_elements++;
            }
            rightColumn--;

            // Step03: Print Bottom Column
            for(int i=rightColumn; i>=leftColumn && total_elements<r*c; i--) {
                System.out.print(matrix[bottomRow][i] + " ");
                total_elements++;
            }
            bottomRow--;

            // Step04: Print Left Column
            for(int i=bottomRow; i>=topRow && total_elements<r*c; i--) {
                System.out.print(matrix[i][leftColumn] + " ");
                total_elements++;
            }
            leftColumn++;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers of Rows & Columns of Matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter " + r*c + " Elements of Matrix");
        int[][] matrix = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print Given Matrix: ");
        printMatrix(matrix);

        System.out.println("Print The Spiral-Matrix of Given Matrix: ");
        spiralMatrix(matrix,r,c);

    }
}
