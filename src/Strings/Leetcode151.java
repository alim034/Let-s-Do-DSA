package Strings;

public class Leetcode151 {
    public static void main(String[] args) {
        String s = "the sky is blue";

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
//        System.out.println(sb);

        String ans = "";

//        Reverse the entire string
        sb.reverse();
//        System.out.println(sb);

//        Traverse and reverse each word back
        for (int i=0; i<n; i++) {
            String word = "";
            while (i<n && sb.charAt(i)!=' ') {
                word += sb.charAt(i);
                i++;
            }

            StringBuilder word1 = new StringBuilder(word);
            word1.reverse();

            if(word1.length()>0) {
                ans += " " + word1;
            }
        }

//        Return result without leading space
        return ans.trim();
    }
}
