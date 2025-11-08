package Strings;

public class Leetcode2678 {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }

    public static int countSeniors(String[] details) {
        StringBuilder sb = new StringBuilder();

        int count=0;
        for(int i=0; i<details.length; i++) {
            sb.setLength(0);
            sb.append(details[i].substring(11, 13));

//            break;
            int age = Integer.parseInt(String.valueOf(sb));

//            int count = 0;
            if(age>60) {
                count++;
            }
        }
        System.out.println(sb);



        return count;
    }
}
