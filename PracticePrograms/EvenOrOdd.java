// Program to print whether a number is even or odd
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        // Scanner object for taking input form standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input of number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Logic for even or odd
        // If number is evenly divisible by 2 it is even otherwise odd
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}
