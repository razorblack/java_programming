// Take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        int sum = 0; // Variable to store sum of all numbers
        int input; // Variable to store input numbers

        // Logic for repetitive input and sum calculation
        // Use do while loop to start and stop when user enter 0
        System.out.println("Keep entering number, to stop enter 0");
        do {
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        // Printing result
        System.out.println("Sum of all numbers is: " + sum);
    }
}
