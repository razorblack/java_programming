import java.util.ArrayList;
import java.util.Scanner;

public class NOFIX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test cases
        int T = scanner.nextShort();
        for (int i = 1; i <= T; i++) {
            // Input
            int N = scanner.nextInt();
            ArrayList<Long> A = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                A.add(j, scanner.nextLong());
            }

            // Logic
            int count = 0;
            int temp = isContainFixedPoint(A, N);
            if (temp != -1) {
                int result = -1;
                long K = Long.MAX_VALUE;

                while (result == -1) {
                    A.add(temp, K);
                    N++;
                    temp = isContainFixedPoint(A, N);
                    if (temp == -1) {
                        result = 1;
                    }
                    count++;
                    K--;
                }
            }

            // Output
            System.out.println(count);

        }
    }

    public static int isContainFixedPoint(ArrayList<Long> A, int N) {

        for (int i = 0; i < N; i++) {
            if (A.get(i) == (i + 1)) {
                return i;
            }
        }
        return -1;
    }
}
