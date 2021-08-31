import java.util.Scanner;

class LowerTriangularMatrix {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter order of square matrix");
        int n = ob.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter a square matrix of order:" + n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = ob.nextInt();
            }
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j && a[i][j] != 0) //Checking for Lower Triangular Matrix
                {
                    c++;
                }
            }
        }
        if (c == 0) {
            System.out.println("Entered Matrix is Lower Triangular Matrix");
        } else {
            System.out.println("Entered Matrix is not Lower Triangular Matrix");
        }
    }
}