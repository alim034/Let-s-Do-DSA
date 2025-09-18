package Strings;

public class Leetcode3280 {
    public static void main(String[] args) {
        String date = "2080-02-29";
        System.out.println(convertDateToBinary(date));
    }

    public static String convertDateToBinary(String date) {
        String[] dateArray = date.split("-");

        int yearInteger = Integer.parseInt(dateArray[0]);
        int monthInteger = Integer.parseInt(dateArray[1]);
        int daysInteger = Integer.parseInt(dateArray[2]);

        String yearBinary = Integer.toBinaryString(yearInteger);
        String monthBinary = Integer.toBinaryString(monthInteger);
        String daysBinary = Integer.toBinaryString(daysInteger);

        String ans = yearBinary+"-"+monthBinary+"-"+daysBinary;

        return ans;
    }
}
