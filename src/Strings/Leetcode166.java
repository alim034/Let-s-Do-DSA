package Strings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Leetcode166 {
    public static void main(String[] args) {
        int numerator = 2, denominator = 1;
        System.out.println(fractionToDecimal(numerator,denominator));
    }

    public static String fractionToDecimal(int numerator, int denominator) {

        if (numerator % denominator == 0) {
            return String.valueOf(numerator / denominator);
        }
        double ans = (double)numerator/denominator;

        String str = String.valueOf(ans);
        StringBuilder answer1 = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '.') {
                sb.append(str.substring(i+1, str.length()));
                answer1.append(str.substring(0,i));
            }
        }
        System.out.println(answer1);
//        System.out.println(sb);

        Set<Character> set1 = new HashSet<>();
        for (int a=0; a<sb.length(); a++) {
            set1.add(sb.charAt(a));
        }
//        System.out.println(set1);

        String ans1 = set1.stream().map(String::valueOf).collect(Collectors.joining(""));
//        System.out.println(ans1);


        StringBuilder sb1 = new StringBuilder();
        String str1 = "";
        boolean hasDuplicate = false;
        for (int j=0; j<sb.length(); j++) {
            for (int k=j+1; k<sb.length(); k++) {
                if(sb.charAt(j)==sb.charAt(k)) {
                    hasDuplicate = true;
                    str1 += sb.charAt(j);
                    break;
                }
            }
        }
        if (hasDuplicate) {
            sb1.append("(");
        }
        sb1.append(ans1);
        if (hasDuplicate) {
            sb1.append(")");
        }
        System.out.println(sb1);

        StringBuilder finalAnswer = new StringBuilder();
        finalAnswer.append(answer1);
        finalAnswer.append(".");
        finalAnswer.append(sb1);




        return String.valueOf(finalAnswer);
    }
}
