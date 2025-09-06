/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];
        int temp = -1;

        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][2] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 7) {
                    temp = 0;
                }
            }
            if (temp == 0) {
                System.out.println("YES");
                temp = -1;
            } else {
                System.out.println("NO");
            }
        }
    }
}
