import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T =scanner.nextInt(); // No. of test cases

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Size of array
            int Q = scanner.nextInt(); // No of queries

            int[] A = new int[N]; // Array

            // Array input
            for (int j = 0; j < N; j++) {
                A[j] = scanner.nextInt();
            }

            int[][] query = new int[Q][4]; // Array for query format (L, R, X, product)

            for (int j = 0; j < Q; j++) {
                query[j][0] = scanner.nextInt() -1; // Value of L
                query[j][1] = scanner.nextInt() -1; // Value of R
                query[j][2] = scanner.nextInt(); // Value of X

                // Finding and storing product query[][3]
                int product = 1;
                for (int k = query[j][0]; k <= query[j][1]; k++) {
                    product *= A[k];
                }
                query[j][3] = product;
            }


            // Finding maximum power of X
            for (int j = 0; j < Q; j++) {
                int power = 0;
                int divisor = query[j][2];
                int dividend = query[j][3];

                while (dividend % Math.pow(divisor, power) == 0) {
                    power++;
                }

                // Printing power for each query
                System.out.println(power - 1);
            }

        }
    }
}
