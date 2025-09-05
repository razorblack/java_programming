import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Write your code here
        int i = scan.nextInt();
        scan.nextLine(); // Changing the cursor to next line
        double d = scan.nextDouble();
        scan.nextLine(); // Changing the cursor to next line
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
