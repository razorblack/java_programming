// Perimeter Of Circle, Equilateral Triangle, Parallelogram
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter choice for finding perimeter:");
        System.out.println("1-Circle; 2-Equilateral Triangle; 3-Parallelogram");
        int choice = scanner.nextInt();

        // Variable to store perimeter
        float perimeter;
        if (choice == 1) {
            System.out.println("Enter radius of circle:");
            float radius = scanner.nextFloat();

            // Logic for perimeter of circle
            // Perimeter of circle = 2 * pi * radius
            perimeter = (float) (2 * Math.PI * radius);

            // Printing result
            System.out.println("Perimeter of circle is: " + perimeter + " sq.unit");
        } else if(choice == 2) {
            System.out.println("Enter length of triangle:");
            float side = scanner.nextFloat();

            // Logic for perimeter of equilateral triangle
            // Perimeter of equilateral triangle = 3 * side
            perimeter = 3 * side;

            // Printing result
            System.out.println("Perimeter of equilateral triangle is: " + perimeter + " sq.unit");
        } else if(choice == 3) {
            System.out.println("Enter length of first parallel side:");
            float length1 = scanner.nextFloat();
            System.out.println("Enter length of second parallel side:");
            float length2 = scanner.nextFloat();

            // Logic for perimeter of parallelogram
            // Perimeter of parallelogram = 2 * (sum of length of parallel sides)
            perimeter = 2 * (length1 + length2);

            // Printing result
            System.out.println("Perimeter of parallelogram is: " + perimeter + " sq.unit");
        } else {
            System.out.println("Enter valid choice! Try Again.");
        }
    }
}
