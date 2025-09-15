package Strings;

public class Leetcode3541 {
    public static void main(String[] args) {
        String s = "successes";
        System.out.println(maxFreqSum(s));
    }

    public static int maxFreqSum(String s) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonant = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                vowels.append(s.charAt(i));
            } else {
                consonant.append(s.charAt(i));
            }
        }

        int[] freqVowels = frequency(String.valueOf(vowels));
        int[] freqConsonant = frequency(String.valueOf(consonant));

        int maxVowels = maxEle(freqVowels);
        int maxConsonant = maxEle(freqConsonant);

        int ans = maxVowels+maxConsonant;

        if(ans>0) {
            return ans;
        }

        return 0;
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static int[] frequency(String s) {
        String str = s.replace(" ", "");

        int[] freq = new int[256];

        for(int i: str.toCharArray()) {
            freq[i]++;
        }

        return freq;
    }

    public static int maxEle(int[] nums) {
        int maxi = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > maxi) {
                maxi = nums[i];
            }
        }

        return maxi;
    }
}
