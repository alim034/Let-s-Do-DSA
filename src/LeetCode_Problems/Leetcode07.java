package LeetCode_Problems;

public class Leetcode07 {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverse(num));
    }

    public static int reverse(int x) {

        int reverse = 0;

        while(x!=0) {
            int digit = x%10;

            if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10) {
                return 0;
            }

            reverse = digit + reverse*10;
            x = x/10;
        }

        return reverse;
    }
}
