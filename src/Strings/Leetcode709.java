package Strings;

public class Leetcode709 {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
//        String ans = s.toLowerCase();
//        return ans;

//        return s.toLowerCase();

        StringBuilder res = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch>='A' && ch<='Z') {
                ch = (char) (ch+32);
            }

            res.append(ch);
        }

        return res.toString();
    }
}
