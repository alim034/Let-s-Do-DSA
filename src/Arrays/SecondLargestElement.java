package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
//        int[] arr = {12, 35, 1, 10, 34, 1};
//        int[] arr = {10,5,10};
        int[] arr = {10,10,10};

        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr) {
        int max = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int sec_max = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > sec_max && arr[i] <max) {
                sec_max = arr[i];
            }
        }

        return sec_max;
    }
}
