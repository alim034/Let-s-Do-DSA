package Strings;

public class Leetcode1678 {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        StringBuilder ans  = new StringBuilder();

        for(int i=0; i<command.length(); i++) {
            if(command.charAt(i) == 'G') {
                ans.append('G');
            } else if (command.charAt(i) == '(') {
                if(command.charAt(i+1) == ')') {
                    ans.append("o");
                    i++;
                } else if (command.charAt(i+1) == 'a') {
                    if (command.charAt(i+2) == 'l') {
                        if (command.charAt(i+3) == ')') {
                            ans.append("al");
                        }
                    }
                }
            }
        }

        return String.valueOf(ans);
    }
}
