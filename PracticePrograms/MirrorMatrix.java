import java.util.Scanner;

class MirrorMatrix {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter order of matrix");
        int n = ob.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter matrix of order " + n + "x" + n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = ob.nextInt();
            }
        }
        System.out.println("Mirror Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}