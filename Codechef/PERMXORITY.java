import java.util.Scanner;

public class PERMXORITY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte T = scanner.nextByte();

        for (byte i = 0; i < T; i++) {
            int N = scanner.nextInt();

            if (N == 2) {
                System.out.println(-1);
            } else if (N == 3) {
                System.out.println(1 + " " + 2 + " " + 3);
            } else {
                if (N % 2 != 0) {
                    System.out.println(-1);
                } else {
                    int A[] = new int[N];



                    for (int j = 0; j < N; j++) {
                        System.out.print(A[i] + " ");
                    }
                }
            }
        }
    }
}
