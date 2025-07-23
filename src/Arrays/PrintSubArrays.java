package Arrays;

public class PrintSubArrays {
    public static void main(String[] args) {

        int[] nums = {2,3,4,5,6,7,8};

        printSubArrays(nums);
    }

    public static void printSubArrays(int[] nums) {

        int n=nums.length;

        int totalSubArrays = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total SubArrays Are:"+ totalSubArrays);
    }
}
