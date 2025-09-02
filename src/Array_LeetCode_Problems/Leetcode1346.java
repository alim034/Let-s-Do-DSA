package Array_LeetCode_Problems;

public class Leetcode1346 {
    public static void main(String[] args) {
        int[] nums = {10,2,5,3};
        System.out.println(checkIfExist(nums));
    }

    public static boolean checkIfExist(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i != j && arr[i]==2*arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
