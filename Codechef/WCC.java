import java.util.Scanner;

public class WCC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test cases
        short T = scanner.nextShort();
        for (short i = 1; i <= T; i++) {
            // Input
            int X = scanner.nextInt();
            scanner.nextLine();
            String S = scanner.nextLine();

            // Logic
            int wonByCarlsen;
            byte pointsByChef = 0;
            byte pointsByCarlsen = 0;
            for (byte j = 0; j < 14; j++) {
                char ch = S.charAt(j);

                if (ch == 'C') {
                    pointsByCarlsen += 2;
                }

                if (ch == 'D') {
                    pointsByCarlsen += 1;
                    pointsByChef += 1;
                }

                if (ch == 'N') {
                    pointsByChef += 2;
                }
            }

            if (pointsByCarlsen > pointsByChef) {
                wonByCarlsen = 60 * X;
            } else if (pointsByCarlsen == pointsByChef) {
                wonByCarlsen = 55 * X;
            } else {
                wonByCarlsen = 40 * X;
            }

            // Output
            System.out.println(wonByCarlsen);
        }
    }
}
