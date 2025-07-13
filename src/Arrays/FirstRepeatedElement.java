package Arrays;

public class FirstRepeatedElement {
    public static void main(String[] args) {

        int[] nums = {1,5,3,4,6,3,4};

        System.out.println(firstRepeatedValue(nums));
    }

    public static int firstRepeatedValue(int[] nums) {
        int n = nums.length;

//        int repeatValue = -1;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i]==nums[j] ) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}
