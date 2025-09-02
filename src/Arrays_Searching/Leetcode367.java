package Arrays_Searching;

public class Leetcode367 {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(16));
        int num = 16;

        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {

        // 1ST Appraoch
//         double ans = Math.sqrt(num);
//
//        double ans1 = Math.floor(ans);
//
//            if(ans == ans1) {
//            return true;
//        }
//
//        return false;

        long start = 1;
        long end = num;



        while(start <= end) {
            long mid = start + (end-start) / 2;

            long square = mid*mid;

            if (square == num) {
                return true;
            }else if(square > num) {
                end = mid -1;
            } else  {
                start = mid+1;
            }
        }

        return false;
    }

}
