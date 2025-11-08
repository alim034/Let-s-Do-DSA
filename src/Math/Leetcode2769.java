package Math;

public class Leetcode2769 {
    public static void main(String[] args) {
        int num = 4;
        int t = 1;
        System.out.println(theMaximumAchievableX(num,t));
    }

    public static int theMaximumAchievableX(int num, int t) {

        int x = num+t;

        while(t!=0) {
            num = ++x;
        }

        return num;
    }
}
