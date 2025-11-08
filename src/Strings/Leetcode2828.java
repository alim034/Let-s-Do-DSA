package Strings;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2828 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("charlie");
        String s = "abc";

        System.out.println(isAcronym(list, s));
    }

    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<words.size(); i++) {
            sb.append(words.get(0));
        }

        System.out.println(sb);
        System.out.println("=================");

        if(s.equals(sb.toString())) {
            return true;
        }

        return false;
    }
}
