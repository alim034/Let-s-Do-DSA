package Strings;

import java.util.Arrays;

public class Leetcode1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] in = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s,in));
    }

    public static String restoreString(String s, int[] indices) {

        int n = s.length();

        // Character Array of the given Strin
        char[] str = new char[n];

        for(int i=0; i<n; i++) {
            str[indices[i]] = s.charAt(i);
        }
//
//        String ans = String.valueOf(str);
//        return ans;

        return String.valueOf(str);
    }
}
