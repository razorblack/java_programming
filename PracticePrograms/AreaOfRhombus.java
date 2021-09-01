// Area Of Rhombus
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter length of first diagonal:");
        float diagonal1 = scanner.nextFloat();
        System.out.println("Enter length of second diagonal:");
        float diagonal2 = scanner.nextFloat();

        // Logic for area calculation
        // Area = (length of first diagonal * length of second diagonal) / 2
        float area = diagonal1 * diagonal2 / 2;

        // Printing results
        System.out.println("Area of rhombus is: " + area + " sq.unit");
    }
}
