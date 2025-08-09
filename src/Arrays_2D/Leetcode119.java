package Arrays_2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode119 {

    public static void printArray(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascal(int nums) {
        int[][] ans = new int[nums][];

        for(int i=0; i<nums; i++) {
            ans[i] = new int[i+1];

            ans[i][0]=ans[i][i] = 1;

            for(int j=1; j<i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        return ans;
    }

    public static List<List<Integer>> pascal1(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i)  {
                    list.add(1);
                } else {
                    list.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                }
            }
            ans.add(list);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hieght of Trianlge");
        int n = sc.nextInt();

        // Printing the Pascal Triangle Using Array.
        int[][] ans = pascal(n);
        printArray(ans);

        System.out.println("================");

        // Printing the Particular Row of Pascal Triangle Using Array.
        System.out.println("Enter RowIndex of Triangle");
        int n1 = sc.nextInt();

        int[][] ans1 = pascal(n1+1);
        for(int i: ans1[n1]) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("=================");

        // Printing the Pascal Trianlge using the List.
        List<List<Integer>> ans3 = pascal1(n);
        System.out.println(ans3);

        // Printing the Particular Row of Pascal Triangle uisng the List
        System.out.println("Enter RowIndex of Triangle");
        int n2 = sc.nextInt();
        List<List<Integer>> ans4 = pascal1(n2+1);

        List<Integer> ans_list = ans4.get(n2);

        for(int i: ans_list) {
            System.out.print(i + " ");
        }
    }
}
