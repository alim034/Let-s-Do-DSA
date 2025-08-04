package Arrays_2D;

import java.util.Scanner;

public class Introduction {

    public static void main(String[] args) {

        // Initialization of 2D Arrays
        // Method01:
//        int[][] nums = new int[2][3];
        // First Bracket show the row number and second show the column
        // initialization of row is mendetory, column is not.

        // Method02: Literals
        int[][] nums = {
                {1,2,3,4,5},
                {0,9,8,7,6},
                {1,3,5,73,9},
                {2,4,6,8,0,34}
        };

        // Printing of 2D arrays
//        printArrays(nums);

        // USER INPUT IN THE 2D-ARRAY
        Scanner sc = new Scanner(System.in);

        // Example01:
//        int[][] number = new int[3][4];
//
//        for(int i=0; i<3; i++) {
//            for(int j=0; j<4; j++) {
//                number[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }

//        printArrays(number);

        // Example02:
        System.out.println("Enter Number of Rows");
        int row  = sc.nextInt();
        System.out.println("Enter Number of Column");
        int column = sc.nextInt();

        int[][] number1 = new int[row][column];

        System.out.println("Enter " + row*column + " Elements");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                number1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        printArrays(number1);
    }


    public static void printArrays(int[][] nums) {
        int n = nums.length;;
        for(int i=0; i<n; i++) { // rows
            for(int j=0; j<nums[i].length; j++) { //column
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
