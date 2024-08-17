// Problem Link: https://www.codechef.com/FEB221C/problems/EUREKA

import java.util.Scanner;

public class EUREKA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short T = scanner.nextShort();
        for (short i = 1; i <= T; i++) {
            int result;
            short N = scanner.nextShort();

            // Logic and output
            result = (int) Math.round(Math.pow(0.143 * N, N));

            System.out.println(result);
        }
    }
}
