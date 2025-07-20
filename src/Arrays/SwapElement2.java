package Arrays;

public class SwapElement2 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};

        System.out.println("Array Before Swapping: ");
        for(int i: nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        int firstElement = nums[0];
        int lastElement = nums[5];

        firstElement = firstElement + lastElement;
        lastElement = firstElement - lastElement;
        firstElement = firstElement-lastElement;

        System.out.println("Array After Swapping: ");
        for(int i: nums) {
            System.out.print(i + " ");
        }
    }
}
