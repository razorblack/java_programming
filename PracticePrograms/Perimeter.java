// Perimeter Of Circle, Equilateral Triangle, Parallelogram, Rectangle, Square, Rhombus
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter choice for finding perimeter:");
        System.out.println("1-Circle; 2-Equilateral Triangle; 3-Parallelogram; 4-Rectangle; 5-Square; 6-Rhombus");
        int choice = scanner.nextInt();

        // Variable to store perimeter
        float perimeter;
        if (choice == 1) {
            // Taking input
            System.out.println("Enter radius of circle:");
            float radius = scanner.nextFloat();

            // Logic for perimeter of circle
            // Perimeter of circle = 2 * pi * radius
            perimeter = (float) (2 * Math.PI * radius);

            // Printing result
            System.out.println("Perimeter of circle is: " + perimeter + " sq.unit");
        } else if(choice == 2) {
            // Taking input
            System.out.println("Enter length of triangle:");
            float side = scanner.nextFloat();

            // Logic for perimeter of equilateral triangle
            // Perimeter of equilateral triangle = 3 * side
            perimeter = 3 * side;

            // Printing result
            System.out.println("Perimeter of equilateral triangle is: " + perimeter + " sq.unit");
        } else if(choice == 3) {
            // Taking input
            System.out.println("Enter length of first parallel side:");
            float length1 = scanner.nextFloat();
            System.out.println("Enter length of second parallel side:");
            float length2 = scanner.nextFloat();

            // Logic for perimeter of parallelogram
            // Perimeter of parallelogram = 2 * (sum of length of parallel sides)
            perimeter = 2 * (length1 + length2);

            // Printing result
            System.out.println("Perimeter of parallelogram is: " + perimeter + " sq.unit");
        } else if (choice == 4) {
            // Taking input
            System.out.println("Enter length of rectangle:");
            float length = scanner.nextFloat();
            System.out.println("Enter breadth of rectangle:");
            float breadth = scanner.nextFloat();

            // Logic for perimeter of rectangle
            // Perimeter of rectangle = 2 * (length + breadth)
            perimeter = 2 * (length + breadth);

            // Printing result
            System.out.println("Perimeter of rectangle is: " + perimeter + " sq.unit");
        } else if (choice == 5) {
            // Taking input
            System.out.println("Enter length of side:");
            float side = scanner.nextFloat();

            // Logic for perimeter of square
            // Perimeter of square = 4 * side
            perimeter = 4 * side;

            // Printing result
            System.out.println("Perimeter of square is: " + perimeter + " sq.unit");
        } else if (choice == 6) {
            // Taking input
            System.out.println("Enter length of side:");
            float side = scanner.nextFloat();

            // Logic for perimeter of rhombus
            // Perimeter of rhombus = 4 * side
            perimeter = 4 * side;

            // Printing result
            System.out.println("Perimeter of rhombus is: " + perimeter + " sq.unit");

        } else {
            System.out.println("Enter valid choice! Try Again.");
        }
    }
}
