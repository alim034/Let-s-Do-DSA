package Arrays_2D;

import java.util.Scanner;

public class ReverseColumn {

    public static void reverseColumn(int[][] m1, int r, int c){

        int rows = m1.length;
        int cols = m1[0].length;

        for(int i=0; i<cols; i++) {
            int start = 0;
            int end = r-1;

            while(start<end) {
                int temp = m1[start][i];
                m1[start][i] = m1[end][i];
                m1[end][i] = temp;

                start++;
                end--;
            }
        }

        printMatrix(m1);
    }



    public static void printMatrix(int[][] m) {
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers of Rows and Column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r*c + " Num of Elements");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is: ");
        printMatrix(matrix);

        System.out.println("Matrix After Reverse Column: ");
        reverseColumn(matrix,r,c);

    }
}
