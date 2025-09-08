package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1317 {
    public static void main(String[] args) {
//        int n = 11;
        int n = 2;

        int[] ans = getNoZeroIntegers(n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getNoZeroIntegers(int n) {

        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = i+1;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(nums[i]+nums[j]==n && isNonZero(nums[i]) && isNonZero(nums[i])) {
                    return new int[]{nums[i],nums[j]};
                }
            }
        }

        return new int[]{-1,-1};
    }

    public static boolean isNonZero(int num) {
        while (num>0) {
            if(num%10==0) {
                return false;
            }
            num /= 10;
        }

        return true;
    }
}
