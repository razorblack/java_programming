package basic;

import java.util.Scanner;

class MatrixSort {
    static int M;
    static int A[][];

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a no.between 3 and 10");
        M = ob.nextInt();
        if (M <= 3 && M >= 10) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        A = new int[M][M];
        System.out.println("Enter matrix of order:" + M + "X" + M);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = ob.nextInt();
            }
        }
        //Printing original Matrix
        System.out.println("ORIGINAL MATRIX");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println("");
        }
        sort(A);
    }

    //Method to sort non boundary elements and printing diagonal elements and their sum.
    public static void sort(int A[][]) {
        int x = M * M - M * 2 - (M - 2) * 2;
        int arr[] = new int[x];//Array to store non boundary elements.
        int temp = 0;
        for (int i = 0; i < M; i++)//Loop to store non boundary elements in another array
        {
            for (int j = 0; j < M; j++) {
                if (i > 0 && i < M - 1 && j > 0 && j < M - 1) {
                    arr[temp] = A[i][j];
                    temp++;
                }
            }
        }
        for (int i = 0; i < M - 1; i++)//Sorting array containing non boundary elements
        {
            for (int j = 0; j < M - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        temp = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (i > 0 && i < M - 1 && j > 0 && j < M - 1) {
                    A[i][j] = arr[temp];
                    temp++;
                }
            }
        }
        System.out.println("REARRANGED MATRIX");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println("");
        }
        int sum = 0;
        System.out.println("DIAGONAL ELEMENTS");
        for (int i = 0; i < M; i++)//Loop to print diagonals and to find their sum
        {
            for (int j = 0; j < M; j++) {
                if (i == j || i + j == M - 1) {
                    System.out.print(A[i][j] + " ");
                    sum = sum + A[i][j];
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("Sum of Diagonal Elements=" + sum);
    }
}