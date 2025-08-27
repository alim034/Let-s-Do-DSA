package Array_LeetCode_Problems;

public class Leetcode136 {
    public static void main(String[] args) {

//         int[] nums = {2,2,1};
        int[] nums = {4,1,2,1,2};

        System.out.println(singleNum(nums));
    }

    public static int singleNum(int[] nums) {

        int n = nums.length;

        /* Brute Force Approach */
//        for(int i=0; i<n; i++) {
//            int num = nums[i];
//            int count = 0;
//
//            for(int j=0; j<n; j++) {
//                if(nums[i]==nums[j]) {
//                    count++;
//                }
//            }
//
//            if(num==1) {
//                return num;
//            }
//        }
//
//        return -1;

        /*Optimal Solution*/

        int xor = 0;
        for(int i=0; i<n; i++) {
            xor = xor ^ nums[i];
        }

        return xor;
    }
}
