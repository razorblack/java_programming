// Program to input principal, time and rate (P, T, R) from user and find Simple Interest
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Scanner object for taking input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.println("Enter principal amount:");
        int principal = scanner.nextInt();
        System.out.println("Enter time period (in years):");
        int time = scanner.nextInt();
        System.out.println("Enter rate of interest:");
        float rate = scanner.nextFloat();

        // Logic for interest calculation
        // Interest = (Principal * Rate * Time) / 100
        float interest = (principal * rate * time) / 100;

        // Printing result
        System.out.println("Interest after " + time + " years is: " + interest);

    }
}
