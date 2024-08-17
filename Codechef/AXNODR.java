import java.util.Scanner;

public class AXNODR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int iterator = 0; iterator < T; iterator++) {
            long N = scanner.nextLong();

            if (N % 2 != 0) {
                N = N - 1;
            }
            int result = 0;

            // Todo result calculation


            System.out.println(1 ^ result);
        }
    }
}
