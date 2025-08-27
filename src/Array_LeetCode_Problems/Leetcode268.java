package Array_LeetCode_Problems;

public class Leetcode268 {

    public static void main(String[] args) {

        int[] nums = {3,0,1};
//        int[] ans = missingNumber(nums);
//
//        for(int i: ans) {
//            System.out.print(i + " ");
//        }

        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {

        int n = nums.length;

//        Arrays.sort(nums);

//        int missNum = 0;
//        for(int i=0; i<n; i++) {
//           for(int j=0; j<n; j++) {
//               if(nums[i] != nums[j]) {
//                   missNum = nums[i];
//               }
//           }
//        }

        int arrayElementsSum = 0;
        for(int i=0; i<n; i++) {
            arrayElementsSum = arrayElementsSum+nums[i];
        }

        int actaulSum = (n*(n+1))/2;

        int missNum = actaulSum-arrayElementsSum;



        return missNum;
    }
}
