package Arrays;

public class SwapElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int len = arr.length;

        System.out.println("Array Before Swap:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int firstElement = 0;
        int secondElement = len-1;

        // Swap logic
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;

        System.out.println("Array After Swap:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
