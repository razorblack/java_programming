import java.util.Arrays;
import java.util.Scanner;

public class CBYTE3 {
    public static void main(String[] args) {
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        short T = scanner.nextShort(); // Testcase
        scanner.nextLine();

        for (short i = 0; i < T; i++) {
            // Input
            String S = scanner.nextLine();

            // Logic
            short len = (short) S.length();

            if (len < 2) {
                System.out.println("NO");
                continue;
            }

            boolean result = true;
            for (short j = 0; j < len;) {
                String twoSub = "";
                String threeSub = "";

                // Finding substring
                if ( j + 3 <= len) {
                    twoSub = S.substring(j , j + 2);
                    threeSub = S.substring(j, j +3);
                } else if (j + 2 <= len) {
                    twoSub = S.substring(j, j + 2);
                }

                // Checking substring
                if (twoSub == "aa" || twoSub =="bb") {
                    j = (short) (j + 2);
                } else if (threeSub == "aaa" || threeSub == "bbb") {
                    j = (short) (j + 3);
                } else if (twoSub == "" || threeSub == "") {
                    j = (short) (j + 1);
                } else {
                    result = false;
                    break;
                }
            }

            // Output
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
