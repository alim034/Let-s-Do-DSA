// Given Q queries, check if the given number is present in the array or not.

package Arrays;

import java.util.Scanner;

public class PresentQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take Num of Element in the Array
        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();

        // Take Element of the Array
        int[] nums = new int[size];
        System.out.println("Enter Elements of the Array: ");
        for(int i=0; i<size; i++) {
            nums[i] = sc.nextInt();
        }

        // Take number of the queries as the input
        System.out.println("Enter number of the Queries: ");
        int queries = sc.nextInt();


        // Creating the Frequency Array
        int[] freq = makeFrequency(nums);

        while(queries>0) {
            System.out.println("Enter Number to Search");
            int search = sc.nextInt();

            if(freq[search]>0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            queries--;
        }
    }

    public static int[] makeFrequency(int[] nums) {
        int[] freq = new int[100002];

        for (int i=0; i< nums.length; i++) {
            freq[nums[i]]++;
        }

        return freq;
    }
}
