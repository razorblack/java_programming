import java.util.ArrayList;
import java.util.Scanner;

public class NOFIX1 {
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
            for (int j = 0; j < N; j++) {
                if (A.get(j) - count == (j + 1)) {
                    count++;
                }
            }

            // Output
            System.out.println(count);

        }
    }
}
