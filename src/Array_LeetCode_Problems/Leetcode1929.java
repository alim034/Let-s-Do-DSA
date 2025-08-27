package Array_LeetCode_Problems;

public class Leetcode1929 {

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        int[] arr1 = getConcatenation(arr);

        for(int i: arr1) {
            System.out.print(i + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n*2];
//        System.out.println(ans.length);

       for(int i=0; i< n; i++) {
           ans[i] = nums[i];
           ans[i+n] = nums[i];
       }

       return ans;
    }
}
