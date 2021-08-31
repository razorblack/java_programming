import java.util.Scanner;

class SpiralFashionFilling {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int n = ob.nextInt();
        int x = n * n;
        int i = 0, j = 0, c1 = 0, c2 = n - 1, r1 = 0, r2 = n - 1;
        int a[][] = new int[n][n];
        //Loop to fill matrix in SPIRAL FASHION
        do {
            for (i = c1; i <= c2; i++) {
                a[r1][i] = x;
                x--;
            }
            for (j = r1 + 1; j <= r2; j++) {
                a[j][c2] = x;
                x--;
            }
            for (i = c2 - 1; i >= c1; i--) {
                a[r2][i] = x;
                x--;
            }
            for (j = r2 - 1; j >= r1 + 1; j--) {
                a[j][c1] = x;
                x--;
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        while (x >= 1);
        System.out.println("Matrix filled by Spiral Fashion");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}