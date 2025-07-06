package Math;

public class Leetcode509 {
    public static void main(String[] args) {

//        int num = 1;
        int num = 3;

        System.out.println(fib(num));
    }

    public static int fib(int num) {

        int number;

        if(num==0) {
            return 0;
        } else if(num==1) {
            return 1;
        } else {
            number = fib(num-1)+fib(num-2);
        }

        return number;
    }
}
