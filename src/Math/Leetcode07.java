package Math;

public class Leetcode07 {
    public static void main(String[] args) {

        int num = 123;

        System.out.println(reverse(num));
    }

    public static int reverse(int num) {

        int  reverse = 0;

        while(num != 0) {
            int digit = num%10;

            if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE) {
                    return  0;
            }

            reverse = digit + reverse*10;
            num = num/10;
        }

        return reverse;
    }
}
