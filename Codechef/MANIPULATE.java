import java.util.Scanner;

public class MANIPULATE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte T = scanner.nextByte();

        for (int i = 0; i < T; i++) {
            byte X = scanner.nextByte();
            byte Y = scanner.nextByte();
            if (Y <= X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
