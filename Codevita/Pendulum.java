import java.util.Scanner;

public class Pendulum {
    public static void main(String[] args) {
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input
        byte N = scanner.nextByte(); // No of forces
        int distance = scanner.nextInt(); // Distance of pendulum
        String direction = scanner.nextLine(); // Direction of distance

        // N forces
        int[] arr = new int[N];
        for (int i = 0; i < N ; i++) {
            arr[i] = scanner.nextInt();
        }

        // Logic + Output
        int[] sum = new int[N]; // array to store cumulative sum of arr
        sum[0] = arr[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }
        int lower = 0; // lower pointer
        int upper = 1; // upper pointer
        boolean isRunning = true;

        while (upper < N && isRunning) {
            if (sum[upper] - sum[lower] == distance) {
                System.out.println("Possible");
                isRunning = false;

            } else if (sum[upper] - sum[lower] > N) {
                lower++;
            } else {
                upper++;
            }
        }

        if (isRunning) {
            System.out.println("Not Possible");
        }

    }
}
