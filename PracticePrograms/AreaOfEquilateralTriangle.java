// Area Of Equilateral Triangle
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter length of side:");
        float side = scanner.nextFloat();

        // Logic for area calculation
        // Area = sqrt(3) / 4 * side * side
        float area = (float) (Math.sqrt(3) / 4 * Math.pow(side, 2));

        // Printing result
        System.out.println("Area of equilateral triangle is: " + area + " sq.unit");
    }
}
