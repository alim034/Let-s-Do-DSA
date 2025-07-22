package Arrays;

public class PrintPairs {

    public static void main(String[] args) {

        int[] nums = {2,4,6,8,10};

        printPairs(nums);
    }

    public static void printPairs(int[] nums) {
        int n = nums.length;

        int numOfPairs = 0;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                System.out.print("(" + nums[i] + "," + nums[j] + ")");
                numOfPairs++;
            }
            System.out.println();
        }

        System.out.println("Numbers Of Pairs: " + numOfPairs);
    }
}
