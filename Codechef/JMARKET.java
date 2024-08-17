import java.util.Scanner;

public class JMARKET {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        // Logic + Input
        for (int i = 0; i < T; i++) {
            short X = scanner.nextShort();
            byte A = scanner.nextByte();
            byte B = scanner.nextByte();
            byte C = scanner.nextByte();

            int totalCost = (A < B) ? ((A < C) ? A : C) : ((B < C) ? B : C);
            X--;

            for (short j = 0; j < X; j++) {

            }


            // Output
            System.out.println(totalCost);

        }
    }
}
