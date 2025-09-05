public class Pattern1 {
    public static void main(String[] args) {
        // Variable to store number of stars in each row
        // Variable to store number of rows in pattern
        int n = 5;
        pattern1(n);
    }

    /**
     * Time O(n^2)
     * Space Input: O(1)
     * Space Auxiliary O(2)
     * @param n input
     */
    private static void pattern1(int n) {
        // An outer loop for number of rows
        for (int i = 1; i <= n; i++) {
            // An inner loop for printing stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* "); // Printing in same line
            }
            System.out.println(); // Changing line here
        }
    }
}
