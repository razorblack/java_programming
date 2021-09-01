// Area Of Circle
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the radius of circle:");
        float radius = scanner.nextFloat();

        // Logic for area calculation
        // Area = PI * r * r
        float areaOfCircle = (float) (Math.PI * Math.pow(radius,2));

        // Printing result
        System.out.println("Area of circle having radius " + radius + " unit is: " + areaOfCircle + " sq.unit");
    }
}
