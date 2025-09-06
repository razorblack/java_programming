import java.util.*;

public class MatrixSorting {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter no. of rows of matrix");
        int M = ob.nextInt();
        System.out.println("Enter no. of column of matrix");
        int N = ob.nextInt();
        if (M > 10 || N > 10 || M <= 2 || N <= 2) {
            System.out.println("Matrix size out off range");
            System.exit(0);
        }
        int A[][] = new int[M][N];
        System.out.println("Enter matrix of order:" + M + "X" + N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = ob.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println("");
        }
        int x[] = new int[N];
        int temp = 0;
        for (int i = 0; i < M; i++) {
            temp = 0;
            for (int j = 0; j < N; j++) {
                x[temp] = A[i][j];
                temp++;
            }
            for (int k = 0; k < N - 1; k++) {
                for (int l = 0; l < N - 1; l++) {
                    if (x[l] > x[l + 1]) {
                        int temp1 = x[l];
                        x[l] = x[l + 1];
                        x[l + 1] = temp1;
                    }
                }
            }
            temp = 0;
            for (int m = 0; m < N; m++) {
                A[i][m] = x[temp];
                temp++;
            }
        }
        System.out.println("Matrix After Sorting Rows");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
        