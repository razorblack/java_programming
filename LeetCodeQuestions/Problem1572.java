public class Problem1572 {
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
    }

    // Time On2 Space O1
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

    // Time On Space O1
    public static int diagonalSum1(int[][] mat) {
       int sumPrimary = 0;
       int n = mat.length;
       for (int i = 0; i < n; i++) {
           sumPrimary += mat[i][i];
       }

       int sumSecondary = 0;
       for (int i = 0; i < n; i++) {
           sumSecondary += mat[i][n - i - 1];
       }

       int middleElement = n % 2 == 0 ? 0 : mat[n / 2][n /2];

       return sumPrimary + sumSecondary - middleElement;
    }
}
