public class Pattern42 {
    public static void main(String[] args) {
        pattern1(5);
    }

    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(3)
     * @param n input
     */
    private static void pattern1(int n) {

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            // Space Printing
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            // Increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }


            // Decreasing
            ch -= 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(ch + " ");
                ch--;
            }

            // Change Line
            System.out.println();

        }
    }
}
