// Take name as input and print a greeting message for that name
import java.util.Scanner;

public class WelcomeGreeting {
    public static void main(String[] args) {
        // Scanner object for taking input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input of name from user
        System.out.println("Enter a name:");
        String name = scanner.nextLine();

        // Printing greeting message for name
        System.out.println("Hi!, Welcome to Java World " + name);
    }
}
