import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Number is not prime\n");
            System.exit(0);
        }

        int check =  0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check++;
            }
        }

        if (check > 0) {
            System.out.println("Number is not prime\n");
        } else {
            System.out.println("Number is prime\n");
        }
    }
}
