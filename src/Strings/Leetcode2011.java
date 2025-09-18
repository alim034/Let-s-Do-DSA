package Strings;

public class Leetcode2011 {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;

        for (int i=0; i<operations.length; i++) {
            if(operations[i].contains("X++")) {
                ans++;
            } else if(operations[i].contains("++X")) {
                ans++;
            } else if(operations[i].contains("X--")) {
                ans--;
            } else if(operations[i].contains("--X")) {
                ans--;
            }
        }

        return ans;
    }
}
