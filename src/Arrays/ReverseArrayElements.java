package Arrays;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int len = arr.length;

        System.out.println("Array Before Reverse");
        for(int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reverse Element Logic
        for(int i=0; i<len; i++) {
            // swap element logic
            int temp = arr[i];
            arr[i] = arr[len-1];
            arr[len-1] = temp;
        }

        System.out.println("Array After Reverse");
        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
}
