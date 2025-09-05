public class Pattern3 {
    public static void main(String[] args) {
        pattern1(5);

        // Modified version of the above pattern
        pattern2(5);
    }

    /**
     * Time O((n * (n-1))/2) = O(n^2/2 + n/2) = O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(3)
     * @param numberOfRows input number of rows
     */
    private static void pattern1(int numberOfRows) {
        // Variable to store number of stars in row
        int numberOfStars = numberOfRows;

        // An outer loop for number of rows
        for (int i = 0; i < numberOfRows; i++) {
            // An inner loop for printing stars
            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("* "); // Printing in same line
            }
            numberOfStars--; // Decreasing number of stars for next row
            System.out.println(); // Changing line here
        }
    }

    /**
     * Time O((n * (n-1))/2) = O(n^2/2 + n/2) = O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(2)
     * @param n input number of rows
     */
    private static void pattern2(int n) {
        // In this inner loop is dependent of outer loop for number of stars to be printed
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* "); // Printing in same line
            }
            System.out.println(); // Changing line here
        }
    }
}
