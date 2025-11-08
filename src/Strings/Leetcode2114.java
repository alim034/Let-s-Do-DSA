package Strings;

public class Leetcode2114 {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(int i=0; i<sentences.length; i++) {

            int current = sentences[i].split(" ").length;
            ans = Math.max(ans,current);
        }

        return ans;
    }

}
