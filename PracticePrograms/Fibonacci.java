import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input of limit of series will be printed
        System.out.println("Enter the limit of fibonacci series:");
        int limit = scanner.nextInt();

        // Logic of fibonacci series: 0 1 1 2 3 5 8 13....
        // Series started with 0, 1 and after that each new terms is the sum of last two terms

        int a = 0; // First number of fibonacci
        int b = 1; // Second number of fibonacci
        int c = a + b;
        System.out.print(a + " " + b + " ");
        while (c <= limit) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
