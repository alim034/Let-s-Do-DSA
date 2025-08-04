package Arrays_2D;
import java.util.*;


public class TwoMetricesAddition {

    public static void addtionMatrix(int[][] m1, int r1, int c1, int[][] m2, int r2, int c2) {
        if(r1!=r2 || c1!=c2) {
            System.out.println("Addition is Not Possible");
            return;
        }

        int[][] sum = new int[r1][c1];

        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
            System.out.println();
        }

        printMatrix(sum);
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
        Scanner sc = new Scanner(System.in);

        // Take the First Matrix From user
        System.out.println("Enter Number of Rows and Columns of 1st Matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter " + r1*c1 + " Elements ");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // Take the 2nd Matrix From User
        System.out.println("Enter Numbers of Rows and Columns of 2nd Matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter " + r2*c2 + " Elements");
        for(int i=0; i<r2; i++) {
            for(int j=0; j<c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("1st Matrix Is: ");
        printMatrix(matrix1);
        System.out.println("2nd Matrix Is: ");
        printMatrix(matrix2);

        System.out.println("Addition of Two Matrices is: ");
        addtionMatrix(matrix1,r1,c1,matrix2,r2,c2);
    }
}
