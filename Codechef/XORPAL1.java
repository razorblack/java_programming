import java.util.Scanner;

public class XORPAL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test cases
        short T = scanner.nextShort();
        for (short i = 1; i <= T; i++) {
            // Input
            int N = scanner.nextInt();
            scanner.nextLine();
            String S = scanner.nextLine();

            // Logic
            if (N % 2 != 0) {
                // Case 1: Length == odd always possible to arrange
                System.out.println("YES");
            } else {
                // Case 2: To be arranged condition and even length
                int result = -1;

                int noZero = 0;
                int noOne = 0;


                for (int j = 0; j < N; j++) {
                    if (S.charAt(j) == '0') {
                        noZero++;
                    } else {
                        noOne++;
                    }
                }

                if (noOne == noZero) {
                    result = 1;
                }

                if (noOne == N || noZero == N) {
                    result = 1;
                }

                if (noOne % 2== 0 && noZero % 2 == 0) {
                    result = 1;
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
}
