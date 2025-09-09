package Strings;

public class Leetcode1903 {
    public static void main(String[] args) {
//        String s = "35427";
       String s = "4206";

       System.out.println(largestOddNumber(s));

//        int num = 123;
//        System.out.println(lastDigit(num));
    }

    public static String largestOddNumber(String num) {

        int n = num.length();

        for(int i=n-1; i>=0; i--) {
            if(Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                return num.substring(0,i+1);
            }
        }

        return "";
    }

}
