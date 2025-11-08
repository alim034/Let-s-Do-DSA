package Strings;

public class Leetcode2053 {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;

        System.out.println(kthDistinct(arr, k));
    }

    public static String kthDistinct(String[] arr, int k) {
        int count = 0;

        for(int i=0; i<arr.length; i++) {
//            count = 0;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]!=arr[j]) {
                    count++;
                    System.out.println(count);
                }

                if(count==k) {
                    System.out.println(arr[i]);
                    return arr[i];
//                    System.out.println(arr[i]);
                }
            }
        }

        return "";
    }
}
