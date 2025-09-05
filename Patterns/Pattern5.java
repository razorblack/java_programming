public class Pattern5 {
    public static void main(String[] args) {
        // Variable to store number of rows in pattern
        int numberOfRows = 5;
        pattern1(numberOfRows);

        // Modified version of the above pattern
        pattern2(5);
    }

    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(2)
     * @param n input
     */
    private static void pattern2(int n) {
        // In this method inner loop is dependent of outer loop for number of stars to be printed

        // Increasing pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // Printing in same line
            }
            System.out.println(); // Changing line here
        }
        // Decreasing pattern
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // Printing in same line
            }
            System.out.println(); // Changing line here
        }
    }


    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(3)
     * @param n input
     */
    private static void pattern1(int n) {
        // Variable to store number of stars in row
        int numberOfStars = 1;

        // Logic for pattern

        // An outer loop for number of rows
        // An inner loop for printing stars
        // Keep increasing number of stars to be printed for every row
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("* "); // Printing in same line
            }
            numberOfStars++; // Increasing number of stars for next row
            System.out.println(); // Changing line here
        }

        numberOfStars -= 2; // Decreasing value to counter last updated value

        // Keep decreasing number of stars to be printed for every row
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("* "); // Printing in same line
            }
            numberOfStars--; // Decreasing number of stars for next row
            System.out.println(); // Changing line here
        }
    }
}
