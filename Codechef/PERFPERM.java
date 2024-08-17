import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PERFPERM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short T = scanner.nextShort();
        for (short i = 1; i <= T; i++) {
            // Input
            int N = scanner.nextInt();
            int K = scanner.nextInt();

            // Logic
            int[] P = new int[N];
            for (int j = 0; j < K; j++) {
                P[j] = (j + 1);
            }

            for (int j = K; j < N; j++) {
                P[j] = j + 2;
            }

            // Output
            for (int j = 0; j < N; j++) {
                System.out.print(P[j] + " ");
            }
            System.out.println();
        }
    }
}
