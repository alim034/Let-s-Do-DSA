package Arrays;

public class CheckIsSorted {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,1,5,6,7,8,8,9};
        int[] arr = {1,2,3,4,5,5,6,6,7};
//        int[] arr = {-1,-2,10};

        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        int len = arr.length;

        for (int i=0; i<len-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }

        return true;
    }
}
