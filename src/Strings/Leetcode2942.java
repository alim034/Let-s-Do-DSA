package Strings;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2942 {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';

        System.out.println(findWordsContaining(words,x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<words.length; i++) {
            if(words[i].contains(String.valueOf(x))) {
                ans.add(i);
            }
        }

        return ans;
    }
}
