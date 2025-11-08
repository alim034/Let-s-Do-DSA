package Strings;

public class Leetcode2000 {
    public static void main(String[] args) {
        String  word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word,ch));
    }

    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == ch) {
                sb.reverse();

                sb.append(word.substring(i + 1));
                return sb.toString();
            }
        }
        System.out.println(sb);

        return "";
    }
}
