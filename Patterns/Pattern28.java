public class Pattern28 {
    public static void main(String[] args) {
        pattern1(3);
    }

    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(3)
     *
     * @param n input number of rows
     */
    private static void pattern1(int n) {

        // Upper triangle
        for (int i = 0; i < n; i++) {
            for (int k = n - i - 1; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower triangle
        for (int i = n - 1; i >= 1; i--) {
            for (int k = n - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
