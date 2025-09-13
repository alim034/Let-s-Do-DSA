package Strings;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "hello world";
        s = s.replace(" ", "");

        int[] freq = new int[256];

        for (int i: s.toCharArray()) {
            freq[i]++;
        }

        for (int i=0; i<freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " → " + freq[i]);
            }
        }
    }
}
