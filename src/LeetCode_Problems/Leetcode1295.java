package LeetCode_Problems;

public class Leetcode1295 {

    public static void main(String[] args) {
//        int[] nums = {12,345,2,6,7896};
        int[] nums = {555,901,482,1771};

        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {

        int n = nums.length;

        // an empty array of size same
        int[] ans = new int[n];

        // count number of digit for each element
        for(int i=0; i<n; i++) {
            int numberOfDigits = 0;
            while(nums[i]>0) {
                nums[i] /= 10;
                numberOfDigits++;
            }

            ans[i] = numberOfDigits;
        }

        // iterate the new array
        int count = 0;

        for(int i=0; i<n; i++) {
            if(ans[i] % 2 ==0) {
                count++;
            }
        }

        return count;
    }
}
