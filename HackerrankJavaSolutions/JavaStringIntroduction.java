import java.util.Scanner;

public class JavaStringIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        /* Enter your code here. Print output to STDOUT. */
        int l1 = A.length();
        int l2 = B.length();

        System.out.println(l1 + l2);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        char ch1 = A.charAt(0);
        char ch2 = B.charAt(0);

        ch1 = (char) ((int) ch1 - 32);
        ch2 = (char) ((int) ch2 - 32);

        A = ch1 + A.substring(1);
        B = ch2 + B.substring(1);
        System.out.println(A + " " + B);
    }
}
