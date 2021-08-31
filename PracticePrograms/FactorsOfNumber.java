// Input a number and print all the factors of that number
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input of number
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        // Logic for finding factors
        // If number is evenly divisible by any natural number then that
        // natural number is the factor of the number
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }
}
