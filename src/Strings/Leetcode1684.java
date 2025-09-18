package Strings;

import java.util.HashSet;
import java.util.Set;

public class Leetcode1684 {
    public static void main(String[] args) {
        String allowed = "ab";
        String [] words = {"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> allowedSet = new HashSet<>();
        for (char ch: allowed.toCharArray()) {
            allowedSet.add(ch);
        }

        for (String str: words) {
            boolean isConsistent = true;
            for (char ch: str.toCharArray()) {
                if (!allowedSet.contains(ch)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}
