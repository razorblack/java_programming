
import java.util.Scanner;

public class SampleProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short T = scanner.nextShort();

        for (int j = 1; j <= T; j++) {
            // Input
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            short[] C = new short[N];

            for (int i = 0; i < N; i++) {
                C[i] = scanner.nextShort();
            }

            // Logic
            int totalCandies = 0;
            for (int i = 0; i < N; i++) {
                totalCandies += C[i];
            }

            int remainingCandies = totalCandies % M;
            // Output
            System.out.println("Case #" + j + ": " + remainingCandies);
        }
    }
}
