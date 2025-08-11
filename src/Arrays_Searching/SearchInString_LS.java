package Arrays_Searching;

public class SearchInString_LS {

    public static void main(String[] args) {

        String str = "Hello Coders!!!!";
//        char target = 'h';
        char target = 'H';


        boolean b = searchInString(str,target);
        System.out.println(b);

        // return the index of the target
        int ans = searchInString1(str,target);

        if(ans==-1) {
            System.out.println("Target is Not Found!!!!!!");
        } else {
            System.out.println("Target " + target + " Found  At Index " + ans);
        }
    }

    // This Method return only the true or false
    public static boolean searchInString(String str, char target) {
        int n = str.length();

        if(n==0) {
            return false;
        }

        for(int i=0; i<n; i++) {
            if(target==str.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    // This function return the index value
    public static int searchInString1(String str, char target) {
        int n = str.length();

        if(n==0) {
            return -1;
        }

        for(int i=0; i<n; i++) {
            if(target==str.charAt(i)) {
                return i;
            }
        }

        return -1;
    }
}
