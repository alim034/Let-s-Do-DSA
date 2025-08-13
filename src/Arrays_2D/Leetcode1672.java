package Arrays_2D;

public class Leetcode1672 {

    public static void main(String[] args) {
        int[][] nums = {
                {1,5},
                {7,3},
                {3,5}
        };

        System.out.println(maximumWealth(nums));
    }

    public static int maximumWealth(int[][] accounts) {
        int n = accounts.length;

        int maxSum = 0;

        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if(sum>maxSum) {
                maxSum = sum;
            }

        }

        return maxSum;
    }
}
