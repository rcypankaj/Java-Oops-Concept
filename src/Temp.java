import java.util.Scanner;

public class Temp {
    static int count = 0;
    public static boolean compareString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==( (i+1) + '0')) {
                return false;
            }
        }
        return true;
    }
    public static void printPerm(String str, String res) {
        if (str.isEmpty()) {
//            System.out.println(res);
//            if (compareString(res)) {
                count++;
//            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (Character.getNumericValue(currChar) == res.length()+1) {
                continue;
            }
            String sub = str.substring(0, i) + str.substring(i+1);
            printPerm(sub, res + currChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        printPerm(sb.toString(), "");
        System.out.println(count);
    }
}
