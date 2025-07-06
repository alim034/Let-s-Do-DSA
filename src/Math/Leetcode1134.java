package Math;

public class Leetcode1134 {
    public static void main(String[] args) {

        int num = 153;

        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num) {

        if(check(num)) {
            return true;
        }

        return false;
    }

    public static boolean check(int num) {
        int originalNumber = num;
        double sum = 0;
        int numbersOfDigits = String.valueOf(num).length();

        while(num>0) {
            int digit = num%10;
            sum = sum + Math.pow(digit, numbersOfDigits);
            num = num/10;
        }

        return originalNumber==sum;
    }
}
