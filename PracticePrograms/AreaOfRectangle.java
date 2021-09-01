// Area Of Rectangle
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter length of rectangle:");
        float length = scanner.nextFloat();
        System.out.println("Enter breadth of rectangle:");
        float breadth = scanner.nextFloat();

        // Logic for area calculation
        // Area = length * breadth

        float areaOfRectangle = length * breadth;

        // Printing result
        System.out.println("Area of rectangle is: " + areaOfRectangle + " sq.unit");
    }
}
