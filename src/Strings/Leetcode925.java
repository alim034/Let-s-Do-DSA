package Strings;

import java.util.*;

public class Leetcode925 {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";

        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : typed.toCharArray()) {
            set.add(ch);
        }
        System.out.println(set);

        StringBuilder sb = new StringBuilder();
        for (char i: set) {
            sb.append(i);
        }
        System.out.println(sb); // alex -> stringBuilder

        String newStr = String.valueOf(sb);
        System.out.println(newStr); // alex -> string

        if (name.equals(newStr)) {
            return true;
        }

        return false;
    }
}
