public class Pattern6 {
    public static void main(String[] args) {
        // Variable to store number of rows in pattern
        int numberOfRows = 5;
        // Variable to store number of stars in rows
        int numberOfStars = 1;
        // Variable to store number of spaces to be printed in rows before printing stars
        int numberOfSpaces = 4;

        // Logic for pattern
        // An outer loop for number of rows
        // An inner loop for printing spaces
        // An other inner loop for printing stars
        // Keep increasing number of stars to be printed for every row
        // Keep decreasing number of spaces to be printed for every row
        for (int i = 0; i < numberOfRows; i++) {
            for (int k = 0; k < numberOfSpaces; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*"); // Printing in same line
            }
            numberOfStars++; // Increasing number of stars for next row
            numberOfSpaces--; // Decreasing number of spaces for next row
            System.out.println(); // Changing line here
        }

        // Modified version of the above pattern
        // In this inner loop is dependent of outer loop for number of stars and space to be printed
//        for (int i = 1; i <= numberOfRows; i++) {
//            for (int k = numberOfRows - i; k > 0; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("*"); // Printing in same line
//            }
//            System.out.println(); // Changing line here
//        }
    }
}
