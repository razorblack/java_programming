// Program to print factorial of a number

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        // Scanner object for taking input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input of number from user
        System.out.println("Enter a positive number:");
        int number = scanner.nextInt();

        // Calling method to calculate factorial of a number
        int factorial = calculateFactorial(number);

        // Printing factorial result
        if (factorial == -1) {
            System.out.println("Entered number is negative. Please enter positive number");
        } else {
            System.out.println("Factorial of " + number + " is:");
            System.out.println(factorial);
        }
    }

    private static int calculateFactorial(int number) {
        int fact = 1; // Variable to store factorial

        // Logic to calculate factorial
        if (number < 0) return -1;
        if (number == 0) return 1;
        // Multiply the number with fact and decrement the number util zero
        while (number > 0) {
            fact *= number;
            number--;
        }

        // Returning result of factorial
        return fact;
    }
}
