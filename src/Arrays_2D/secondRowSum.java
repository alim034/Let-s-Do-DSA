// Print out the sum of the numbers in the second row of the nums[][] arrays
package Arrays_2D;

public class secondRowSum {

    public static void main(String[] args) {
        // TEST CASE 01:
//        int[][] nums = {
//                {1,4,9},
//                {11,4,3},
//                {2,2,3}
//        };

        // TEST CASE 02:
//        int[][] nums = {
//                {2, 7, 1, 5},
//                {3, 9, 4, 6},
//                {8, 0, 3, 2}
//        };

        // TEST CASE 03:
        int[][] nums = {
                {10, 20},
                {30, 40},
                {50, 60},
                {70, 80}
        };

        System.out.println(rowSum(nums));
    }

    public static int rowSum(int[][] nums) {
        int sum =0;

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                if(i == 1) {
                    sum += nums[i][j];
                }
            }
        }

        return sum;
    }
}
