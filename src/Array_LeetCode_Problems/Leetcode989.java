package Array_LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;

public class Leetcode989 {

    public static void main(String[] args) {
//        int[] num = {1,2,0,0};
//        int k = 34;

        int[] num = {2,7,4};
        int k = 181;

        System.out.println(addToArrayForm(num,k));

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i< num.length; i++) {
            l.add(num[i]);
        }

//        System.out.println(l);

        int list_size = l.size();

//        int n ;
//        for(int i=0; i<list_size; i++) {
//            n = l.get(i);
//            System.out.print(n + " ");
//        }
//        System.out.println();

        StringBuilder sb = new StringBuilder();
        for(int i: l) {
            sb.append(i);
        }
//        System.out.println(sb);

        int numValue = Integer.parseInt(sb.toString());
//        System.out.println(numValue);

        int ansValue = numValue + k;
//        System.out.println(ansValue);

        String s = Integer.toString(ansValue);
//        System.out.println(s);


        ArrayList<Integer> l1 = new ArrayList<>();

        for(char ch: s.toCharArray()) {
            l1.add(Character.getNumericValue(ch));
        }

//        System.out.println(l1);

        return l1;
    }
}
