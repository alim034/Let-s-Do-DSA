package Arrays_2D;

import java.util.Scanner;

public class TwoMatricesMultiplication {

    public static void multiplicationMatrix(int[][] m1, int r1, int c1, int[][] m2, int r2, int c2) {
        if(c1 != r2) {
            System.out.println("Multiplication of These Two Matrices Not Possible.");
            return;
        }

        int[][] mul = new int[r1][c2];

        for(int i=0; i<r1; i++) {
            for(int j=0; j<c2; j++) {
                for(int k=0; k<c1; k++) {
                    mul[i][j] = m1[i][k]*m2[k][j];
                }
            }
        }

        System.out.println("Multiplication of Matrices is:");
        printMatrix(mul);
    }


    public static void printMatrix(int[][] nums) {
        int n = nums.length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take First Matrix Input
        System.out.println("Enter Number of Rows and Column of 1st Matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter " + r1*c1 + " Elements of Matrix");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // Take Second Matrix Input
        System.out.println("Enter Number of Rows and Column of 2nd Matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter " + r2*c2 + " Elements of the Matrix");
        for(int i=0; i<r2; i++) {
            for(int j=0; j<c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("1st Matrix is: ");
        printMatrix(matrix1);
        System.out.println("2nd Matrix is: ");
        printMatrix(matrix2);

        multiplicationMatrix(matrix1,r1,c1,matrix2,r2,c2);
    }

}
