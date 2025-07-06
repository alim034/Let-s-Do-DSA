package Math;

public class Leetcode09 {
    public static void main(String[] args) {

//        int num = 12344;
        int num = 123321;

        System.out.println(isPalindrom(num));
    }

    public static boolean isPalindrom(int num) {

        if(isReverse(num)) {
            return  true;
        }

        return false;
    }

    public static boolean isReverse(int num) {

        int originalNumber = num;
        int reverse = 0;

        while(num!=0) {
            int digit = num%10;
            reverse = digit + reverse*10;
            num = num/10;
        }

        return originalNumber==reverse;
    }
}
