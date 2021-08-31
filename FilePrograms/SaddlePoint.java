import java.util.Scanner;

class SaddlePoint {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter order of square matrix");
        int n = ob.nextInt();
        int A[][] = new int[n][n];
        System.out.println("Enter a square matrix of order:" + n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = ob.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        int min = 0, max = 0, c = 0;
        for (int i = 0; i < n; i++) //Loop to find Saddle Point
        {
            min = 9999;
            max = -9999;
            for (int j = 0; j < n; j++) {
                if (A[i][j] < min) {
                    min = A[i][j];
                    c = j;
                }
            }
            for (int k = 0; k < n; k++) {
                if (A[k][c] > max) {
                    max = A[k][c];
                }
            }
            if (min == max) {
                break;
            }
        }
        if (min == max) {
            System.out.println("Saddle Point:" + min);
        } else {
            System.out.println("No saddle point is present");
        }
    }
}