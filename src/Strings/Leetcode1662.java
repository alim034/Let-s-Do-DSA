package Strings;

public class Leetcode1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();


        for(int i=0; i<word1.length; i++) {
            s1.append(word1[i]);
        }
        System.out.println(s1);

        for(int j=0; j<word2.length; j++) {
            s2.append(word2[j]);
        }
        System.out.println(s2);

        if(String.valueOf(s1).equals(String.valueOf(s2))){
            return true;
        }

        return false;
    }
}
