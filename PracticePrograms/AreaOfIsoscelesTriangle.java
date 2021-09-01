// Area Of Isosceles Triangle
import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter length of equal sides:");
        float lengthOfEqualSide = scanner.nextFloat();
        System.out.println("Enter length of other side:");
        float otherSide = scanner.nextFloat();

        // Logic for area calculation
        // Area = (1 / 4) * b * sqrt((4 * a^2 - b^2))
        // Where 'a' is length of equal sides
        // 'b' is length of other side
        float areaOfTriangle = (float) ((float) 1 / 4 * otherSide * Math.sqrt(4 * Math.pow(lengthOfEqualSide, 2) - Math.pow(otherSide, 2)));

        // Printing result
        System.out.println("Area of isosceles triangle is: " + areaOfTriangle + " sq.unit");
    }
}
