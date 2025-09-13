package Arrays;

import java.util.Arrays;

public class FrequencyArrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 1, 5, 3, 2, 1};

        // find the maximum element in the array to find the
        // length of the frequency array.
        int[] freq = new int[maxEle(arr)+1];

        for (int i: arr) {
            freq[i]++;
        }

//        System.out.println(Arrays.toString(freq));
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " → " + freq[i]);
            }
        }
    }

    public static int maxEle(int[] arr) {
        int maxi = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }

        return maxi;
    }
}
