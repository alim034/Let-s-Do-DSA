package Arrays;


import java.util.Scanner;

public class RangeSumQuery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();

        int[] nums = new int[size+1];

        System.out.println("Enter Array Elements: ");
        for(int i=1; i<=size; i++) {
            nums[i] = sc.nextInt();
        }

        int[] prefixArray = prefixSum(nums);

        System.out.println("Enter Number of Queries: ");
        int q = sc.nextInt();

        while(q-- > 0) {
            System.out.println("Enter Start Range: ");
            int l = sc.nextInt();
            System.out.println("Enter End Range: ");
            int r = sc.nextInt();

            int ans = prefixArray[r] - prefixArray[l-1];

            System.out.println("Sum is: " + ans);
        }
    }

    public static int[] prefixSum(int[] nums) {

        int n = nums.length;

        for(int i=1; i<n; i++) {
            nums[i] = nums[i]+nums[i-1];
        }

        return nums;
    }
}


/*
*   OUTPUT:
*       Enter Size of Array:
        5
        Enter Array Elements:
        1
        2
        3
        4
        5
        Enter Number of Queries:
        3
        Enter Start Range:
        1
        Enter End Range:
        5
        Sum is: 15
        Enter Start Range:
        1
        Enter End Range:
        4
        Sum is: 10
        Enter Start Range:
        1
        Enter End Range:
        3
        Sum is: 6

        Process finished with exit code 0

* */