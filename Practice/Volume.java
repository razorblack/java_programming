// Volume of Cylinder, Cone, Sphere, Prism, Pyramid
import java.util.*;

public class Volume {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input of choice from user
        System.out.println("Enter your choice 1.Cylinder; 2.Cone; 3.Sphere; 4.Prism; 5.Pyramid:");
        int choice = scanner.nextInt();

        // Variable to store volume
        double volume;

        if (choice == 1) {
            // For cylinder: Taking input
            System.out.println("Enter radius");
            double radius = scanner.nextDouble();
            System.out.println("Enter height");
            double height = scanner.nextDouble();

            // Logic for volume of cylinder
            // Volume = pi * (radius ^ 2) * height
            volume =  Math.PI * Math.pow(radius, 2) * height;

            // Printing result
            System.out.println("Volume of cylinder is: " + volume + " cb.unit");
        } else if (choice == 2) {
            // For cone: Taking input
            System.out.println("Enter radius");
            double radius = scanner.nextDouble();
            System.out.println("Enter height");
            double height = scanner.nextDouble();

            // Logic for volume of cone
            // Volume = (1 / 3) * pi * (radius ^ 2) * height
            volume = (1.0 / 3 * Math.PI * Math.pow(radius, 2) * height);

            // Printing result
            System.out.println("Volume of cone is: " + volume + " cb.unit");
        } else if (choice == 3) {
            // For sphere: Taking input
            System.out.println("Enter radius");
            double radius = scanner.nextDouble();

            // Logic for volume of sphere
            // Volume = (4 / 3) * pi * (radius ^ 3)
            volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

            // Printing result
            System.out.println("Volume of sphere is: " + volume + " cb.unit");
        } else if (choice == 4) {
            // For prism: Taking input
            System.out.println("Enter apothem length");
            double apothemLength = scanner.nextDouble();
            System.out.println("Enter base length");
            double baseLength = scanner.nextDouble();
            System.out.println("Enter height of prism");
            double height = scanner.nextDouble();

            // Logic for volume of prism
            // Volume = a * b * h
            // Where: a-Apothem length of a triangular prism
            // b-Base length of a triangular prism
            // h-height of a triangular prism
            volume = apothemLength * baseLength * height;

            // Printing result
            System.out.println("Volume of prism is: " + volume + " cb.unit");
        } else if (choice == 5) {
            // For pyramid: Taking input
            System.out.println("Enter side length");
            double side = scanner.nextDouble();
            System.out.println("Enter height");
            double height = scanner.nextDouble();

            // Logic for volume of pyramid
            // Volume = 1 / 3 * base area * height
            volume = (1.0 / 3) * Math.pow(side, 2) * height;

            // Printing result
            System.out.println("Volume of pyramid is: " + volume + " cb.unit");
        } else {
            System.out.println("Enter valid choice! Try Again.");
        }
    }
}


