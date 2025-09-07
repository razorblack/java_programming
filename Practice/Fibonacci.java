import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input of limit of series will be printed
        System.out.println("Enter the limit of fibonacci series:");
        int limit = scanner.nextInt();

        if (limit <= 0) {
            System.out.println("Enter valid limit");
            return;
        }

        // Logic of fibonacci series: 0 1 1 2 3 5 8 13....
        // Series started with 0, 1 and after that each new terms is the sum of last two terms

        printFibonacci(limit);
        printFibonacci1(limit);
    }


    /**
     * Time O(n)
     * Space Input O(1)
     * Space Auxiliary O(1)
     * @param limit input
     */
    private static void printFibonacci1(int limit) {
        System.out.print("[");
        if (limit == 1) {
            System.out.print(0);
        } else if (limit == 2) {
            System.out.print(0 + " ");
            System.out.print(1);
        } else {
            int a = 0; // First number of fibonacci
            int b = 1; // Second number of fibonacci
            System.out.print(0 + " ");
            System.out.print(1 + " ");
            int count = 3;
            while (count <= limit) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
                count++;
            }
        }
        System.out.print("]");
    }

    /**
     * Time O(n)
     * Space Input O(1)
     * Space Auxiliary O(n)
     * @param limit input
     */
    private static void printFibonacci(int limit) {
        List<Integer> fib = new ArrayList<>();
        if (limit == 1) {
            fib.add(0);
        } else if (limit == 2) {
            fib.add(0);
            fib.add(1);
        } else {
            int a = 0; // First number of fibonacci
            int b = 1; // Second number of fibonacci
            fib.add(0);
            fib.add(1);
            int count = 3;
            while (count <= limit) {
                int c = a + b;
                fib.add(c);
                a = b;
                b = c;
                count++;
            }
        }
        System.out.println(fib);
    }
}
