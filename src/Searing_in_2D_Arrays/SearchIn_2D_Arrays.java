package Searing_in_2D_Arrays;
import java.util.Arrays;

public class SearchIn_2D_Arrays {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 30;

        int[] ans = searchInMatrix(matrix,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchInMatrix(int[][] nums, int target) {

        for(int i=0; i< nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                if(nums[i][j] == target) {
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }
}
