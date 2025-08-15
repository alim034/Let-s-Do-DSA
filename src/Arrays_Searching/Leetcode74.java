package Arrays_Searching;

public class Leetcode74 {

    public static void main(String[] args) {

//        int[][] matrix = {
//                {1,3,5,7},
//                {10,11,16,20},
//                {23,30,34,60}
//        };
//        int target = 3;

        int[][] matrix = {
                {1,3,5,7,54},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 13;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] nums, int target) {

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                if(nums[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
