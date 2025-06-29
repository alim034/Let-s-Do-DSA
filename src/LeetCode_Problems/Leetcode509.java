package LeetCode_Problems;

public class Leetcode509 {
    public static void main(String[] args) {
        int num = 4;

        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int n) {
        int num;

        if(n==0) {
            return 0;
        } else if(n==1) {
            return 1;
        } else {
            num = fibonacci(n-1)+fibonacci(n-2);
        }

        return num;
    }
}
