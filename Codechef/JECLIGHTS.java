import java.util.Scanner;

public class JECLIGHTS {
    static int totalCount = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testcase
        byte T = scanner.nextByte();

        for (byte i = 0; i < T; i++) {
            byte n = scanner.nextByte(); // Floors
            byte m = scanner.nextByte(); // Rooms per floors
            scanner.nextLine();

            String[] floor = new String[n];
            for (byte j = 0; j < n; j++) {
                floor[j] = scanner.nextLine();
            }

            for (byte j = 0; j < n; j++) {
                int firstIndex = floor[j].indexOf('1');
                int lastIndex = floor[j].lastIndexOf('1');

                if (firstIndex == lastIndex) {

                } else {

                }
            }

            // Output
            System.out.println(totalCount);
        }
    }
}
