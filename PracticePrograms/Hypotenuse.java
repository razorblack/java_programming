import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base: ");
        double base = scanner.nextDouble();
        System.out.println("Enter perpendicular: ");
        double perpendicular = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(perpendicular, 2));

        System.out.println("Hypotenuse = " + hypotenuse);
    }
}
