package Strings;

public class Leetcode1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();

        for(char ch: address.toCharArray()) {
            if(ch=='.') {
                ans.append("[.]");
            } else {
                ans.append(ch);
            }
        }

        return String.valueOf(ans);
    }
}
