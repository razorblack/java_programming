// Take in two numbers and an operator (+, -, *, /) and calculate the value
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Scanner object for taking input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter first number:");
        int firstOperand = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondOperand = scanner.nextInt();
        System.out.println("Enter operator (+, -, *, /)");
        char operand = scanner.next().charAt(0);

        // Logic for calculator
        if (operand == '+') {
            System.out.println("Result is: " + (firstOperand + secondOperand));
        } else if (operand == '-') {
            System.out.println("Result is: " + (firstOperand - secondOperand));
        } else if (operand == '*') {
            System.out.println("Result is: " + (firstOperand * secondOperand));
        } else if (operand == '/') {
            System.out.println("Result is: " + (firstOperand / secondOperand));
        } else {
            System.out.println("Please! Enter the required input.");
        }
    }
}
