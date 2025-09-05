public class Pattern20 {
    public static void main(String[] args) {
        pattern1(5);
    }

    /**
     * Time O(n^2 - n) = O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(2)
     * @param n input number of columns
     */
    private static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
