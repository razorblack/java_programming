import java.util.Scanner;

public class WATERCOOLER2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short T = scanner.nextShort();

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int M = Y / X;

            if (Y % X != 0) {
                System.out.println(M);
            } else {
                System.out.println(M - 1);
            }
        }
    }
}
