public class Pattern37 {
    public static void main(String[] args) {
        pattern1(5);
    }

    /**
     * Time O((n * (n-1))/2) = O(n^2/2 + n/2) = O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(2)
     * @param n input
     */
    private static void pattern1(int n) {
        // An outer loop for number of rows
        for (int i = n; i >= 1; i--) {
            // An inner loop for printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Printing in same line
            }
            System.out.println(); // Changing line here
        }
    }
}
