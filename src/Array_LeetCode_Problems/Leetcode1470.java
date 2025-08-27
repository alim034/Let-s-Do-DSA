package Array_LeetCode_Problems;

public class Leetcode1470 {

    public static void main(String[] args) {

//        int[] arr = {2,5,1,3,4,7};
        int[] arr = {1,2,3,4,4,3,2,1};
        int n = 4;

        int[] ans = shuffleArray(arr , n);

        for(int i: ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] shuffleArray(int[] nums, int n) {

//        step1: Create new empty array

        int[] ans = new int[2*n];

        // Step2: Create a count variables
        int count = 0;

        for(int i=0; i<n; i++) {
            ans[count] = nums[i];
            ans[count+1] = nums[i+n];
            count += 2;
        }

        return ans;
    }
}
