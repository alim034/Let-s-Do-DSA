package Arrays_2D;

import java.util.ArrayList;
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

    // Print to Print the Matrix in Spiral Order
    public static List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int topRow = 0;
        int bottomRow = r-1;
        int leftColumn = 0;
        int rightColumn = c-1;

        List<Integer> list = new ArrayList<>();

        int totalElements = 0;

        while(totalElements<r*c) {
            // Step01: Print the Top Row
            for(int i=leftColumn; i<=rightColumn && totalElements<r*c; i++) {
                list.add(matrix[topRow][i]);
                totalElements++;
            }
            topRow++;

            // Step02: Print the Right Column
            for(int i=topRow; i<=bottomRow && totalElements<r*c; i++) {
                list.add(matrix[i][rightColumn]);
                totalElements++;
            }
            rightColumn--;

            // step03: Print the Bottom Row
            for(int i=rightColumn; i>=leftColumn && totalElements<r*c; i--) {
                list.add(matrix[bottomRow][i]);
                totalElements++;
            }
            bottomRow--;

            // step04: Print the left column
            for(int i=bottomRow; i>=topRow && totalElements<r*c; i--) {
                list.add(matrix[i][rightColumn]);
                totalElements++;
            }
            rightColumn++;
        }

        return list;
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

        System.out.println();
        System.out.println("Print The Spiral-Matrix of Given Matrix: ");
        spiralOrder(matrix);
    }
}
