import java.util.Scanner;

public class ID2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfTest = scanner.nextInt();
        scanner.nextLine();

        // Logic for getting prime numbers in given range
        for (int i = 1; i <= noOfTest; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            // Calling method for printing primes in range of m, n
            primeInRange(m, n);
            scanner.nextLine();
        }
    }

    public static void primeInRange(int m, int n) {
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
