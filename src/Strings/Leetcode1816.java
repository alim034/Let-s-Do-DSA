package Strings;

public class Leetcode1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;

        System.out.println(truncateSentence(s,k));
    }

    public static String truncateSentence(String s, int k) {
        String[] str = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<k; i++) {
            sb.append(str[i]+ " ");
        }

        String ans = String.valueOf(sb);
        String ans1 = ans.trim();

        return ans1;
    }
}
