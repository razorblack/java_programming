import java.util.Scanner;

public class ID1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        // Logic for brute-force printing
        while (true) {
            input = scanner.nextInt();
            if (input == 42) {
                break;
            }
            System.out.println(input);
        }
    }
}
