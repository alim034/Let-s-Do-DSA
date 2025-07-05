package LeetCode_Problems;

public class Leetcode1512 {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,1,1,3};
//        int[] arr = {1,1,1,1};
        int[] arr = {1,2,3};

        System.out.println(numIdenticalPairs(arr));
    }

    public static int numIdenticalPairs(int[] nums) {

        int n = nums.length;

        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=1; j<n; j++) {
                if(nums[i]==nums[j] && i<j) {
                    count++;
                }
            }
        }

        return count;
    }
}
