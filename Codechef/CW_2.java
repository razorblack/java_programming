import java.util.Scanner;

public class CW_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        System.out.println(palindrome(s));
    }

    private static String palindrome(String str) {
        // Case 1: len is less than 2
        if (str.length() <= 2) {
            return "None";
        }

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();

        String str1 = stringBuilder.toString();

        // Case 2: Already a palindrome
        if (str.equalsIgnoreCase(str1)) {
            return "None";
        } else {
            // Case 3: Making str palindrome
            int i = 1;
            str1 = str.toLowerCase();
            for (; i < str1.length() - 1; i++) {
                if (str1.charAt(i) != str1.charAt(0)) {
                    break;
                }
            }
            str1 = stringBuilder.toString();

            return str1.substring(0, str1.length() - i);
        }
    }
}
