import java.util.Scanner;

public class WelcomeToAtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String s = scanner.nextLine();
        s = scanner.nextLine();
        System.out.println((a + b + c) + " " + s);
    }
}
