import java.util.Scanner;

public class NOTUNIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Test cases

        // Input
        for (int iterator = 0; iterator < T; iterator++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // Logic
            int i = A;
            int j = i + 1;
            boolean result = false;

            for (; i < B; i++) {
                for (; j <= B; j++) {
                    if (gcd(i,j) > 1) {
                        result = true;
                        break;
                    }
                }

                if (result) {
                    break;
                }
            }


            // Output
            if (result) {
                System.out.println(i + " " + j);
            } else {
                System.out.println("-1");
            }
        }
    }

    private static int gcd(int i, int j) {
        int res = 1;

        while (i % res == 0 && j % res == 0) {
            res++;
        }

        return res -1;
    }
}
