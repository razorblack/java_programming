/*Given a square array of integers A, we want the minimum sum of
 a falling path through A. A falling path starts at any element
 in the first row, and chooses one element from each row.
 The next row’s choice must be in a column that is different
 from the previous row’s column by at most one.

 INPUT: [[1,2,3][4,5,6][7,8,9]]
 OUTPUT: 12
*/
import java.util.Scanner;
public class FallingPathMinSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Order of matrix
        int[][] matrix = new int[n][n]; // Input Matrix
        int[] fallingPathSum = new int[n]; // Array to store all falling paths
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] =scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            fallingPathSum[i] = calculateFallingSum(matrix, i, n);
        }
        int minSum = minimumInArray(fallingPathSum); //To store the minimum falling paths available
        System.out.println(minSum);
    }
    // Method to find minimum in a array
    protected static int minimumInArray(int[] arr) {
        int minimum = arr[0];
        for (int j : arr) {
            if (j < minimum) {
                minimum = j;
            }
        }
        return minimum;
    }
    private static int calculateFallingSum(int[][] arr, int index, int n) {
        int sum = arr[0][index];
        int j = 0;
        if (index == 0) {
            j = index + 1;
        } if (index == n - 1) {
            j = n - 2;
        }
        for (int i = 1; i< arr.length; i++) {
            for (; j < arr.length; j++) {

            }
        }
        return sum;
    }
}
