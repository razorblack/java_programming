import java.util.Scanner;

public class SUNDAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short T = scanner.nextShort();
        for (short i = 0; i < T; i++) {
            byte N = scanner.nextByte();
            byte numberOfHolidays = 8; // Saturday and Sundays

            for (byte j = 0; j < N; j++) {
                byte temp = scanner.nextByte();
                numberOfHolidays++;

                // For saturdays
                if (temp == 6 || temp == 13 || temp == 20 || temp == 27) {
                    numberOfHolidays--;
                }
                // For sundays
                if (temp == 7 || temp == 14 || temp == 21 || temp == 28) {
                    numberOfHolidays--;
                }
            }

            // Output
            System.out.println(numberOfHolidays);

        }
    }
}
