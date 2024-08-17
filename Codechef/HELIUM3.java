import java.util.Scanner;

public class HELIUM3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test cases
        short T = scanner.nextShort();
        for (short i = 1; i <= T; i++) {

            // Input
            short A = scanner.nextShort();
            short B = scanner.nextShort();
            short X = scanner.nextShort();
            short Y = scanner.nextShort();

            // Logic & Output
            if (A*B <= X*Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
