package Arrays;

public class LargestElement {
    public static void main(String[] args) {
//        int[] arr = {1, 8, 7, 56, 90};
//        int[] arr = {10};
        int[] arr = {};
        System.out.println(largestElement(arr));
    }

    public static int largestElement(int[] arr) {
        int max = -1;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
