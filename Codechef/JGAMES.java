import java.util.Scanner;

public class JGAMES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte T = scanner.nextByte();

        // Logic + Input
        for (byte i = 0; i < T; i++) {
            byte X = scanner.nextByte();
            byte Y = scanner.nextByte();

            // Output
            if ((X % 2 == 0 && Y % 2 == 0) || (X % 2 != 0 && Y % 2 != 0)) {
                System.out.println("Janmansh");
            } else {
                System.out.println("Jay");
            }
        }
    }
}
