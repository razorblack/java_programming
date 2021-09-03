public class Pattern3 {
    public static void main(String[] args) {
        // Variable to store number of rows in pattern
        int numberOfRows = 5;
        // Variable to store number of stars in row
        int numberOfStars = numberOfRows;

        // Logic for pattern
        // An outer loop for number of rows
        // An inner loop for printing stars
        // Keep decreasing number of stars to be printed for every row
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*"); // Printing in same line
            }
            numberOfStars--; // Decreasing number of stars for next row
            System.out.println(); // Changing line here
        }

        // Modified version of the above pattern
        // In this inner loop is dependent of outer loop for number of stars to be printed
//        for (int i = numberOfRows; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*"); // Printing in same line
//            }
//            System.out.println(); // Changing line here
//        }
    }
}
