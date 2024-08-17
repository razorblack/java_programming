/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1, n2, n3;

        for (int i = 0; i < n; i++) {
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();

            if (n1 == 7 || n2 == 7 || n3 == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
