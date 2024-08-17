import java.util.Scanner;

public class WATERCOOLER1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte T = scanner.nextByte();

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int M = scanner.nextInt();

            if (X*M < Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
