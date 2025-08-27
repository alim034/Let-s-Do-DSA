package Array_LeetCode_Problems;


public class Leetcode125 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindrom(String s) {
        String str = s.toLowerCase();
        String str1 = clean(str);

        // String Reverse Logic  or the code for reverse string
        String reverse = "";
        char[] ch = str1.toCharArray();
        for(int i=str1.length()-1; i>=0; i--) {
            reverse = reverse + ch[i];
        }

        // checking for palindrom
        if(str1.equals(reverse)) {
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
            } else {

            }
        }
        return str1;
    }
}
