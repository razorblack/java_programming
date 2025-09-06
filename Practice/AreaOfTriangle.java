// Area Of Triangle
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter length of all three sides of triangle:");
        float side1 = scanner.nextFloat();
        float side2 = scanner.nextFloat();
        float side3 = scanner.nextFloat();

        // Logic for area calculation
        // Area = sqrt(s * (s - a) * (s - b) * (s - c))
        // Where: a, b, c are length of sides of triangle
        // s = (a + b + c) / 2

        float s = (side1 + side2 + side3) / 2;
        float areaOfTriangle = (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Printing result
        System.out.println("Area of triangle is: " + areaOfTriangle + " sq.unit");
    }
}
