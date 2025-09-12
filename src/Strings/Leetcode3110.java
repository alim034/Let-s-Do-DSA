package Strings;

import java.util.Arrays;
import java.lang.Math;
//import static java.lang.Math.abs;


public class Leetcode3110 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s) {

        int[] ascii = new int[s.length()];

        //  we can find the ascii value using casting.
        // and if directly store the character in the integer then
      // also it store the ascii value of that character.
        // because in tha java character store in 16-bit which directly convert into ascii value.
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
//            int asc = (int) ch;
            int asc = ch;
            ascii[i] = asc;
        }
//        System.out.println(Arrays.toString(ascii));

        int sum = 0;

        for(int i=0; i< ascii.length-1; i++) {
            int ans = Math.abs(ascii[i] - ascii[i+1]);
            sum += ans;
        }

        return sum;
    }
}
