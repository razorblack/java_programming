public class Pattern24 {
    public static void main(String[] args) {
        // Variable to store number of rows in pattern
        int numberOfRows = 10;
        int numberOfColumns = numberOfRows;

        // Logic for pattern
        // An outer loop for number of rows
        // An inner loop for printing stars only if satisfied by the conditions:
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                // j == 0 and j == numberOfColumn is for vertical boundaries
                // i == j is for principal diagonal
                // i + j == numberOfColumn - 1 is for other diagonal
                if (j == 0 || j == numberOfColumns - 1 || i == j || i + j == numberOfColumns - 1) {
                    System.out.print("*"); // Printing stars in same line
                } else {
                    System.out.print(" "); // Printing empty spaces in same line
                }
            }
            System.out.println(); // Changing line here
        }
    }
}
