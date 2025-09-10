package Strings;

public class Leetcode1021 {
    public static void main(String[] args) {
//        String s = "(()())(())";
        String s = "()()";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)==')') {
                count--;
            }

            if(count!=0) {
                ans.append(s.charAt(i));
            }

            if(s.charAt(i)=='(') {
                count++;
            }
        }

        return String.valueOf(ans);
    }
}
