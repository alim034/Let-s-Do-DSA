package Strings;

public class Leetcode1784 {
    public static void main(String[] args) {
//        String s = "1001";
        String s = "110";
        System.out.println(checkOnesSegment(s));
    }

    public static boolean checkOnesSegment(String s) {
        int count = 0;
        int maxOnes = 0;

        for(int i=0; i<s.length(); i++) {
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));

            if(num==1) {
                count++;
                maxOnes = Math.max(maxOnes, count);
            } else {
                if(count>0 && maxOnes>0) {
                    for(int j=i+1; j<s.length(); j++) {
                        if (s.charAt(i)=='1') {
                            return false;
                        }
                    }
                }
                count = 0;
            }
        }


        return true;
    }
}
