public class Pattern38 {
    public static void main(String[] args) {
//        pattern1(4);

        pattern2(4);
    }

    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(2)
     * @param n input
     */
    private static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            // Increment loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Spacing loop
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print("  ");
            }

            // Decrement loop
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(3)
     * @param n input
     *          Method only work for n < 10 as reversing n > 10 => 10 -> 01 pattern fails
     */
    private static void pattern1(int n) {
        StringBuilder print = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            print.append(i);
            System.out.print(print);
            for (int j = 1; j <= 2 * n - 2 * print.length(); j++) {
                System.out.print(" ");
            }
            System.out.println(print.reverse());
            print.reverse();
        }
    }
}
