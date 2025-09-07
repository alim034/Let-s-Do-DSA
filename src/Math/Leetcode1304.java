package Math;

import java.util.Arrays;

public class Leetcode1304 {
    public static void main(String[] args) {
//        int n = 6;
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];

        /// first approach
//        int start = 1;
//        int i = 0;
//
//        while(i+1<n) {
//            result[i] = start;
//            result[i+1] = -start;
//
//            i = i+2;
//            start++;
//        }
//
//        return result;

        /// Second Appraoch
        int i = 0;
        int j = n-1;
        int start = 1;

        while (i<j) {
            result[i] = start;
            result[j] = -start;

            i++;
            j--;

            start++;
        }

        return result;
    }
}
