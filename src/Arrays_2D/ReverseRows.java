package Arrays_2D;

import java.util.Scanner;

public class ReverseRows {

    public static void reverseRow(int[][] m1, int r, int c){

        for(int i=0; i<m1.length; i++) {
            int start = 0;
            int end = c-1;

            while(start<end) {
                int temp = m1[i][start];
                m1[i][start] = m1[i][end];
                m1[i][end] = temp;

                start++;
                end--;
            }
        }

        printMatrix(m1);
    }


//    public static void swap(int[] nums, int start, int end) {
//        int n = nums.length;
//
//        while(start<end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//
//            start++;
//            end--;
//        }
//    }

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

        System.out.println("Matrix After Reverse The Rows");
        reverseRow(matrix,r,c);

    }

}
