//Pangrams are the sentences which contains all alphabets

import java.util.Scanner;

public class Pangram {
    static char[] ch = new char[26];
    static String str;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        str = str.toLowerCase();
        boolean isPangram = true;
        alphaArray();
        for (int i = 0; i < 26; i++) {
            if (isIn(ch[i]) == false) {
                isPangram = false;
            }
        }
        System.out.println("Is input string is a pangram :" + isPangram);

    }

    public static void alphaArray() {

        int temp = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            ch[temp] = i;
            temp++;

        }
    }

    public static boolean isIn(char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}
