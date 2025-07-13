// Program to find the total number of pairs in the arrays whose sum is equal to the given value x
package Arrays;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of the Array: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements of the Array: ");
        for(int i=0; i<n; i++) {
            
        }
    }

    public static int pairSum(int[] nums, int target) {

        int n = nums.length;

        int countPairs = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(nums[i]+nums[j] == target) {
                    countPairs++;
                }
            }
        }

        return countPairs;
    }
}
