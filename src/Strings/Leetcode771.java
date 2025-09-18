package Strings;

import java.util.HashSet;
import java.util.Set;

public class Leetcode771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        Set<Character> jewelSet = new HashSet<>();
        for(char ch: jewels.toCharArray()) {
            jewelSet.add(ch);
        }

        String[] stoneArray = stones.split(" ");
        for(String i: stoneArray) {
            for (char ch: i.toCharArray()) {
                if(jewelSet.contains(ch)) {
                    count++;
                }
            }
        }

        return count;
    }
}
