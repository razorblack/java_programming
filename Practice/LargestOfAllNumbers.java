// Take integer inputs till the user enters 0 and print the largest number from all
import java.util.Scanner;

public class LargestOfAllNumbers {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; // Variable to store largest of all numbers
        int input; // Variable to store input numbers

        // Logic for repetitive input and finding largest number
        // Use do while loop to start and stop when user enter 0
        System.out.println("Keep entering number, to stop enter 0");
        do {
            input = scanner.nextInt();

            // Comparing for largest number
            if (input > largest && input != 0) {
                largest = input;
            }
        } while (input != 0);

        // Printing result
        System.out.println("Largest of all numbers is: " + largest);
    }
}
