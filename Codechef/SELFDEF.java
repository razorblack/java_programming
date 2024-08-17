import java.util.Scanner;

public class SELFDEF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte T = scanner.nextByte();
        for (byte i = 0; i < T; i++) {

            // Input
            byte N = scanner.nextByte();
            int numberOfWomen = 0;
            for (byte j = 0; j < N; j++) {
                byte temp = scanner.nextByte();

                if (temp >= 10 && temp <= 60) {
                    numberOfWomen++;
                }
            }

            // Output
            System.out.println(numberOfWomen);
        }
    }
}
