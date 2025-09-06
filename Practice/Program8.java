import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input two strings
        System.out.println("Enter first string: ");
        String s1 = scanner.nextLine();

        System.out.println("Enter second string: ");
        String s2 = scanner.nextLine();

        //Plus operator concatenates the two Strings
        System.out.println(s1 + s2);

        //Input two numbers
        System.out.println("Enter first number:");
        int x = scanner.nextInt();

        System.out.println("Enter second number");
        int y = scanner.nextInt();

        //Plus operator adds the two numbers
        System.out.println(x + y);

    }
}
