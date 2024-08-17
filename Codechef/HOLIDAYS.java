import java.util.Arrays;
import java.util.Scanner;

public class HOLIDAYS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte T = scanner.nextByte();
        for (byte i = 1; i <= T; i++) {


            // Input
            byte N = scanner.nextByte();
            int W = scanner.nextInt();
            byte[] A = new byte[N];
            int totalEarning = 0;
            for (int j = 0; j < N; j++) {
                A[j] = scanner.nextByte();
                totalEarning += A[j];
            }

            // Logic + output
            if (totalEarning == W) {
                System.out.println(0);
            } else {
                int maxNumberOfHolidays = 0;
                totalEarning = 0;
                Arrays.sort(A);
                int j = N - 1;
                while (j >= 0) {
                    totalEarning += A[j];
                    if (totalEarning >= W) {
                        break;
                    }
                    j--;
                }
                maxNumberOfHolidays = j;
                System.out.println(maxNumberOfHolidays);
            }
        }
    }
}
