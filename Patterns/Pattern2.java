public class Pattern2 {
    public static void main(String[] args) {
        pattern1(5);

        pattern2(5);
    }

    /**
     * Time O((n * (n-1))/2) = O(n^2/2 + n/2) = O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(2)
     * @param n input
     */
    private static void pattern2(int n) {
        // In this inner loop is dependent of outer loop for number of stars to be printed
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Printing in same line
            }
            System.out.println(); // Changing line here
        }
    }

    /**
     * Time O((n * (n-1))/2) = O(n^2/2 + n/2) = O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(3)
     * @param n input
     */
    private static void pattern1(int n) {
        int numberOfStars = 1;

        // An outer loop for number of rows
        for (int i = 1; i <= n; i++) {
            // An inner loop for printing stars
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("* "); // Printing in same line
            }
            numberOfStars++; // Increasing number of stars for next row
            System.out.println(); // Changing line here
        }
    }
}
