import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l = A.length() - 1; // Last Index

        // Loop for checking if characters are same from start and end
        for (int i = 0; i <= l / 2; i++) {
            if (A.charAt(i) != A.charAt(l - i)) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");

    }
}
