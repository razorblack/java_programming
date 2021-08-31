import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter no. of rows of first matrix:");
        int r1 = ob.nextInt();
        System.out.print("Enter no. of columns of first matrix:");
        int c1 = ob.nextInt();
        int A[][] = new int[r1][c1];
        System.out.println("Enter a matrix of order:" + r1 + "X" + c1);
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = ob.nextInt();
            }
        }
        System.out.print("Enter no. of rows of second matrix:");
        int r2 = ob.nextInt();
        System.out.print("Enter no. of columns of second matrix:");
        int c2 = ob.nextInt();
        int B[][] = new int[r2][c2];
        System.out.println("Enter a matrix of order:" + r2 + "X" + c2);
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = ob.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("Matrix are not compatible for multiplication");
            System.exit(0);
        }
        int sum = 0;
        int AB[][] = new int[r1][c2];//Matrix AB to store multiplication of A and B
        for (int i = 0; i < r1; i++)//Logic for Matrix Multiplication
        {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    sum += A[i][k] * B[k][j];
                }
                AB[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println("Multiplication of entered matrices");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(AB[i][j] + " ");
            }
            System.out.println("");
        }
    }
}