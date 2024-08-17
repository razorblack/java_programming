import java.util.Scanner;

public class BINBASBASIC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short T = scanner.nextShort();
        for (short i = 1; i <= T; i++) {
            int result = -1;
            short N = scanner.nextShort();
            short K = scanner.nextShort();
            scanner.nextLine();
            String S = scanner.nextLine();

            // Logic
            if (K == 0) {
                // For k = 0 only checking for palindrome
                StringBuilder s = new StringBuilder(S);
                s = s.reverse();
                if (S.equals(s.toString())) {
                    result = 1;
                }
            } else {
                // For k other than 0
                short leftBitIndex = 0;
                short rightBitIndex = (short) (N - 1);
                short count = 0;

                while (leftBitIndex < rightBitIndex) {
                    if (S.charAt(leftBitIndex) != S.charAt(rightBitIndex)) {
                        count++;
                    }
                    leftBitIndex++;
                    rightBitIndex--;
                }

                if (count <= K) {
                    if ((K - count) % 2 == 0) {
                        // If length is even
                        result = 1;
                    } else if (N % 2 != 0){
                        // If length is odd
                        result = 1;
                    }
                }
            }

            // Output
            if (result == -1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
