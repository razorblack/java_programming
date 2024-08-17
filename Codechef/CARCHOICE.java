import java.util.Scanner;

public class CARCHOICE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            byte x1 = scanner.nextByte();
            byte x2 = scanner.nextByte();
            byte y1 = scanner.nextByte();
            byte y2 = scanner.nextByte();

            float costCar1 = (float) y1 / x1;
            float costCar2 = (float) y2 / x2;

            if (costCar1 < costCar2) {
                System.out.println(-1);
            } else if (costCar1 > costCar2) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
