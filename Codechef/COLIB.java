import java.util.Scanner;

public class COLIB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();

        // Logic
        int totalSum = (N * (N + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += scanner.nextInt();
        }

        // Output
        System.out.println(totalSum - sum);

    }
}
