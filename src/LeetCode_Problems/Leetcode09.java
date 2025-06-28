package LeetCode_Problems;

public class Leetcode09 {
    public static void main(String[] args) {
        int num = 121;

        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        if(reverse(x)) {
            return true;
        }

        return false;
    }

    public static boolean reverse(int n) {
        int OriginalValue = n;
        int reverse = 0;

        while(n>0) {
            int digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10;
        }

        return OriginalValue == reverse;
    }
}
