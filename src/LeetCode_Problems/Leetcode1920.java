package LeetCode_Problems;

public class Leetcode1920 {
    public static void main(String[] args) {

        int[] arr = {0,2,1,5,3,4};

        int[] ans = buildArray(arr);

        for(int i: ans) {
            System.out.print(i + " ");
        }

    }

    public static int[] buildArray(int[] arr) {

        int n = arr.length;

//        int[] ans = new int[n];
//
//        for(int i: arr) {
//            ans[i] = arr[arr[i]];
//        }
//
//        return ans;

        // code for so that it not take extra space
        for(int i=0; i<n; i++) {
            int newVal = arr[arr[i]]%n;
            arr[i] = arr[i]+newVal*n;
        }

        for(int i=0; i<n; i++) {
            arr[i] = arr[i]/n;
        }

        return arr;

    }
}
