package LeetCode_Problems;

public class Leetcode1134 {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int n) {

        if(check(n)) {
            return true;
        }

        return false;
    }


    public static boolean check(int n) {
        int originalNum = n;
        int sum = 0;
        int numberOfDigits = String.valueOf(n).length();

        while(n>0) {
            int digit = n%10;
            sum += Math.pow(digit, numberOfDigits);
            n = n/10;
        }

        return originalNum==sum;
    }
}
