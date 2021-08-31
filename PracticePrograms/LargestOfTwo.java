// Take 2 numbers as input and print the largest number
import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        // Logic for finding larger
        // Compare both number and check which is greater
        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        } else {
            System.out.println(secondNumber + " is greater than " + firstNumber);
        }
    }
}
