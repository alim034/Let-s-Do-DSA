package Strings;

import java.util.Arrays;

public class Leetcode2785 {
    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(sortVowels(s)));
    }

    public static String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        char[] vowels = sb.toString().toCharArray();
        Arrays.sort(vowels);

        StringBuilder ans = new StringBuilder();
        int vi = 0;
        for (int i=0; i<s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                ans.append(vowels[vi++]);
            } else {
                ans.append(s.charAt(i));
            }
        }

        return String.valueOf(ans);
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
