package Strings;

public class Leetcode125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String original = clean(str);

        // String reverse logic
        String reverse = "";
        char[] ch = original.toCharArray();
        for(int i=original.length()-1; i>=0; i--) {
            reverse = reverse+ch[i];
        }

        // check if palindrom
        if(original.equals(reverse)) {
            return true;
        }

        return false;
    }

    public static String clean(String s) {
        String str = s;
        String str1 = "";

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z' ||
                ch>='A' && ch<='Z' ||
                ch>='0' && ch<='9') {

                str1 = str1+ch;
            }
        }

        return str1;
    }
}
