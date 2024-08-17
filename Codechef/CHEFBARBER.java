// Problem Link: https://www.codechef.com/FEB221C/problems/CHEFBARBER

import java.util.Scanner;

public class CHEFBARBER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int waitingTime = 0;
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            if (N > 0) {
                waitingTime = N * M;
            }
            System.out.println(waitingTime);
        }


    }
}
