import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two matrix
        System.out.println("Input n");
        int n = scanner.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        System.out.println("Input matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Input matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        // Logic for multiply both matrix
        int[][] multiply = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                multiply[i][j] = sum;
            }
        }

        // Output multiplied matrix
        System.out.println("Matrix after multiplication:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }
    }
}
