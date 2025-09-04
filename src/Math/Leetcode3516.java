package Math;

public class Leetcode3516 {
    public static void main(String[] args) {

//        int x = 2;
//        int y = 7;
//        int z = 4;

//        int x = 2, y = 5, z = 6;

        int x = 1, y = 5, z = 3;

        System.out.println(findClosest(x,y,z));
    }

    public static int findClosest(int x, int y, int z) {

        int firstDiff = 0;
        int secondDiff = 0;

        if(x>z) {
            firstDiff = x-z;
        } else if(z>x) {
            firstDiff = z-x;
        }

        if(y>z) {
            secondDiff = y-z;
        } else if(z>y) {
            secondDiff = z-y;
        }

        if(firstDiff<secondDiff) {
            return 1;
        }
        else if (secondDiff<firstDiff) {
            return 2;
        }

        return 0;
    }
}
