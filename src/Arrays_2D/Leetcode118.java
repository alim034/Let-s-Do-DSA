package Arrays_2D;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Leetcode118 {

    // Method to Print the Matrix
    static void printMatrix(int[][] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

     static int[][] pascal(int n) {
        int[][] ans = new int[n][];

        for(int i=0; i<n; i++) {
            // step01: ith row has i+1 column
            ans[i] = new int[i+1];

            // step02: first and last element is
            ans[i][0]=ans[i][i]=1;

            // step03:
            for(int j=1; j<i; j++) {
                ans[i][j] = ans[i-1][j]+ans[i-1][j-1];
            }
        }

        return ans;
     }

    public static List<List<Integer>> pascal1(int n) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++) {
            List<Integer> list = new ArrayList<>();

            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) {
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
        System.out.println("Enter Height of Pascal Trianlge: ");
        int n = sc.nextInt();

        int[][] ans = pascal(n);
        printMatrix(ans);

        System.out.println("=====================");

        List<List<Integer>> answer = pascal1(n);
        System.out.println(answer);

    }
}
