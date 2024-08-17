import java.util.Scanner;

public class MAYOR_PARTY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short T = scanner.nextShort();
        for (short i = 1; i <= T; i++) {

            int result = -1;
            // Input
            short Pa = scanner.nextShort();
            short Pb = scanner.nextShort();
            short Pc = scanner.nextShort();

            // Logic
            if (Pb >= Pa + Pc) {
                result = Pb;
            } else {
                result = Pa + Pc;
            }

            // Output
            System.out.println(result);
        }
    }
}
