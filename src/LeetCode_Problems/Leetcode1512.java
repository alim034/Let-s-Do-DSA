package LeetCode_Problems;

public class Leetcode1512 {
    public static int numIdenticalPairs(int[] nums) {

        int n = nums.length;

        int count = 0;

        for(int i=0; i<n; i++) {
            for(int j=1; j<n; j++) {
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};

        System.out.println(numIdenticalPairs(arr));
    }
}
