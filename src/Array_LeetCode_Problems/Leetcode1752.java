package Array_LeetCode_Problems;

public class Leetcode1752 {
    public static void main(String[] args) {
//        int[] arr = {3,4,5,1,2};
        int[] arr = {2,1,3,4};

        System.out.println(check(arr));
    }

    public static boolean check(int[] arr) {
        int n = arr.length;

        int cnt = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] > arr[(i+1) % n]) {
                cnt++;
            }
        }

        return cnt <= 1;
    }
}
