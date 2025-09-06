package Math;

import java.util.List;
import java.util.ArrayList;

public class Leetcode412 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<String>();

        for(int i=1; i<=n; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println(list);

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(list.get(i));

            if(num%3==0 && num%5==0) {
                list.set(i,"FizzBuzz");
            } else if (num%3==0) {
                list.set(i,"Fizz");
            } else if(num%5==0) {
                list.set(i,"Buzz");
            }
        }

        return list;
    }
}
