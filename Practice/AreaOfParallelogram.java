// Area Of Parallelogram
import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        // Scanner object to take input from standard input stream
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter length of parallel side:");
        float length = scanner.nextFloat();
        System.out.println("Enter distance between parallel sides:");
        float height = scanner.nextFloat();

        // Logic for area calculation
        // Area of parallelogram = Length of parallel side * Distance between them
        float area = length * height;

        // Printing result
        System.out.println("Area of parallelogram is: " + area + " sq.unit");
    }
}
