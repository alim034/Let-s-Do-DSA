package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Leetcode88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = m+n-1;
        int i = m-1;
        int j = n-1;

        while(i>=0 && j>=0) {
            if(nums1[i]>nums2[j]) {
                nums1[index] = nums1[i];
                index--;
                i--;
            } else {
                nums1[index] = nums2[j];
                index--;
                j--;
            }
        }

        while (j>=0) {
            nums1[index] = nums2[j];
            index--;
            i--;
        }
    }
}
