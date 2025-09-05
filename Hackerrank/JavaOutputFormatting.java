import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            //Complete this line
            int len = s1.length();
            if (len < 16) {
                for (int j = 1; j < 16 - len; j++) {
                    s1 = s1 + " ";
                }
            }
            String x1 = Integer.toString(x);
            len = x1.length();

            while (len < 3) {
                x1 = "0" + x1;
                len++;

            }
            System.out.printf("%s%s\n", s1, x1);

        }
        System.out.println("================================");

    }
}
