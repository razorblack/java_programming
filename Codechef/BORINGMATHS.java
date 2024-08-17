import java.util.Arrays;
import java.util.Scanner;

public class BORINGMATHS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testcase
        byte T = scanner.nextByte();

        for (byte i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = scanner.nextInt();
            }
            Arrays.sort(A);
            if (A[0] == 1) {
                System.out.println(-1);
                continue;
            }
            int limit = A[0];
            int count = 0;
            for (int j = 2; j <= limit; j++) {
                if (isPrime(j) && divide(A, N, j)) {
                    System.out.print(j + " ");
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(-1);
            } else {
                System.out.println();
            }
        }
    }

    private static boolean divide(int[] a, int len, int j) {
        for (int i = 0; i < len; i++) {
            if (a[i] % j != 0) return false;
        }
        return true;
    }

    private static boolean isPrime(int j) {
        if (j <= 1) return false;

        for (int i = 2; i < j; i++){
            if (j % i == 0) return false;
        }
        return true;
    }
}
