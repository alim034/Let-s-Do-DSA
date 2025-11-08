package Strings;

import java.util.Arrays;

public class Leetcode1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        char[] sArr = s.toCharArray();

        Arrays.sort(sArr);

        System.out.println(Arrays.toString(sArr));

        return "";
    }
}
