package Strings;

public class Leetcode165 {
    public static void main(String[] args) {
        String version1 = "1.2", version2 = "1.10";
//        String version1 = "1.01", version2 = "1.001";
//        String version1 = "1.0", version2 = "1.0.0.0";
        System.out.println(compareVersion(version1, version2));
    }

    public static int compareVersion(String version1, String version2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        // Extract number from version1
        for (int i = 0; i < version1.length(); i++) {
            if (version1.charAt(i) == '.') {
                for (int k = i + 1; k < version1.length(); k++) {
                    if (version1.charAt(k) == '.') {
                        s1.append(version1.charAt(i));
                        break;
                    } else {
                        s1.append(version1.substring(i + 1, version1.length()));
                        break; // prevent infinite appending
                    }
                }
            }
        }

        // Extract number from version2
        for (int j = 0; j < version2.length(); j++) {
            if (version2.charAt(j) == '.') {
                for (int l = j + 1; l < version2.length(); l++) {
                    if (version2.charAt(l) == '.') {
                        s2.append(version2.charAt(j));
                        break;
                    } else {
                        s2.append(version2.substring(j + 1, version2.length()));
                        break; // prevent infinite appending
                    }
                }
            }
        }

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("============");

        int num1 = 0;
        if (s1 != null && !s1.toString().isEmpty()) {
            num1 = Integer.parseInt(s1.toString());
        }

        int num2 = 0;
        if (s2 != null && !s2.toString().isEmpty()) {
            num2 = Integer.parseInt(s2.toString());
        }

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("============");

        if (num1 < num2) {
            return -1;
        } else if (num1 > num2) {
            return 1;
        }

        return 0;
    }
}
