package Array_LeetCode_Problems;

public class Leetcode1365 {
    public static void main(String[] args) {
//        int[] arr = {8,1,2,2,3};
//        int[] arr = {6,5,4,8};
        int[] arr = {7,7,7,7,7};

        int[] ans = smallerNumbersThanCurrent(arr);

        for(int i: ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] arr) {

        int n = arr.length;
//        int count =0; // here the count declared as the global
//        ,hence after each iteration it contain tha previous values,
//        so the ans is not correct.

        int[] ans = new int[n];

        for(int i=0; i<n; i++) {
            int count=0; // here count declare as the local in loop and
            // its become zero after each iteration.
            for(int j=0; j<n; j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}
