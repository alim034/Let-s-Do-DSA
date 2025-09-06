package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {29, 10, 14, 37, 13};
        System.out.println("Original array:");
        printArray(data);

        selectionSortDescending(data);

        System.out.println("Sorted array (ascending):");
        printArray(data);
    }


    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;

        // Iterate over the array from end to start
        for (int i = n - 1; i > 0; i--) {
            int maxIndex = 0;

            // Find the index of the maximum element in the unsorted portion
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the maximum element with the element at position i
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


}
