package Strings;

public class Leetcode3227 {
    public static void main(String[] args) {
        String s = "leetcoder";
        System.out.println(doesAliceWin(s));
    }

    public static boolean doesAliceWin(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        if (sb.length()==0) {
            return false;
        }

        return true;
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
