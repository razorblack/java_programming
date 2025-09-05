public class Pattern18 {
    public static void main(String[] args) {
//        pattern1(3);
        // Time limit exceeding in above approach
        pattern2(3);
    }

    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(3)
     * @param n input
     */
    private static void pattern2(int n) {
        // Upper Half
        for (int i = 0; i < n; i++) {
            int spaces = 2 * i;
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= n - i || j >= n - i + spaces + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 0; i--) {
            int spaces = 2 * i;
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= n - i || j >= n - i + spaces + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(2)
     * @param n input
     */
    private static void pattern1(int n) {
        // Upper Half
        for (int i = n; i >= 1; i--) {
            // Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Space
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print("  ");
            }
            // Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Line Change
            System.out.println();
        }

        // Lower Half
        for (int i = 1; i <= n; i++) {
            // Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Space
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print("  ");
            }
            // Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Line Change
            System.out.println();
        }
    }
}
