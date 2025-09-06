// Input currency in rupee and output in dollar
import java.util.Scanner;

public class RupeeIntoDollar {
    public static void main(String[] args) {
        // Scanner object for taking input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter amount in rupees");
        float amountInRupees = scanner.nextFloat();

        // Variable to store conversion rate (i.e 1 rupee = ? dollars)
        float dollarConversionRate = 0.014f;

        // Logic for conversion in dollars
        float amountInDollars = amountInRupees * dollarConversionRate;

        // Printing result
        System.out.println(amountInRupees + " Rs is equivalent to $ " + amountInDollars);
    }
}
