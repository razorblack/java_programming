import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter choice::");
        System.out.println("1-Curved surface area of cylinder; 2-Total surface area of cube");
        int choice = scanner.nextInt();

        // Variable to store perimeter
        float area;
        if (choice == 1) {
            // For Curved surface area of cylinder: Taking input
            System.out.println("Enter radius of base of cylinder");
            float radius = scanner.nextFloat();
            System.out.println("Enter height of cylinder");
            float height = scanner.nextFloat();

            // Logic for Curved Surface Area (CSA) of cylinder
            // CSA = 2 * pi * radius * height
            area = (float) (2 * Math.PI * radius * height);

            // Printing result
            System.out.println("Curved surface area of cylinder is: " + area + " cb.unit");
        } else if (choice == 2) {
            // For Total surface area of cube: Taking input
            System.out.println("Enter length of side");
            float side = scanner.nextFloat();

            // Logic for Total Surface Area (TSA) of cube
            // TSA = 6 * side * side
            area = (float) (6 * Math.pow(side, 2));

            // Printing result
            System.out.println("Total surface area of cube is: " + area + " cb.unit");
        } else {
            System.out.println("Enter valid choice! Try Again.");
        }
    }
}
