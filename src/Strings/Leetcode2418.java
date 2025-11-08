package Strings;

import java.util.*;

public class Leetcode2418 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(sortPeople(names,heights));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<heights.length; i++) {
            list.add(heights[i]);
        }
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

        int[] heights1 = new int[heights.length];
        for (int j=0; j<heights.length; j++) {
            heights1[j] = list.get(j);
        }

        String[] str = new String[names.length];
        for(int k=0; k<names.length; k++) {
            str[heights1[k]] = names[k];

        }


        return str;
    }
}
