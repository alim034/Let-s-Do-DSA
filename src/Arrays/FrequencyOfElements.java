package Arrays;

import java.util.Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr = {1,1,1,3,4,5,3,4,5,2,2,2,2};

        int[] freq = frequecyElement(arr);

//        int visited = -1;
//        for(int i = 0; i < freq.length; i++) {
//            if(freq[i] != visited) {
//                System.out.println(arr[i] + " occurs " + freq[i] + " times");
//            }
//        }

//        System.out.println(Arrays.toString(freq)); // it give the whole array.

        for(int i: freq) {
            System.out.print(i + " ");
        }
    }

    public static int[] frequecyElement(int[] nums) {

        int n = nums.length;

        /* Brute Force for these problem. */
//        int[] freq = new int[n];
//        int visited = -1;
//
//        for(int i = 0; i < n; i++) {
//            if(freq[i] == visited) {
//                continue; // skip already counted numbers
//            }
//
//            int count = 1;
//            for(int j = i + 1; j < n; j++) {
//                if(nums[i] == nums[j]) {
//                    count++;
//                    freq[j] = visited;
//                }
//            }
//            freq[i] = count;
//        }
//
//        return freq;

        /* Optimal Solution for these problem. */


        int[] freq = new int[101];

        for(int num: nums) {
            freq[num]++;
        }

        return freq;
    }
}
