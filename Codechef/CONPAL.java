import java.util.Scanner;

public class CONPAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testcase
        byte T = scanner.nextByte();
        for (byte i = 0; i < T; i++) {
            // Input
            short n = scanner.nextShort();
            scanner.nextLine();
            String S = scanner.nextLine();
            boolean result = true;

            for (short j = 0; j < n/2; j++) {
                char ch1 = S.charAt(j);
                char ch2 = S.charAt(n-j-1);
                int ascii = (int) ch2;
                ascii = 122 - ascii + 97;
                ch2 = (char) ascii;

                if (ch1 != ch2) {
                    result = false;
                    break;
                }
            }

            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
