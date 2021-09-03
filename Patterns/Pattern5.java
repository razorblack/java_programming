public class Pattern5 {
    public static void main(String[] args) {
        // Variable to store number of rows in pattern
        int numberOfRows = 10;
        // Variable to store number of stars in row
        int numberOfStars = 1;

        // Logic for pattern

        // An outer loop for number of rows
        // An inner loop for printing stars
        // Keep increasing number of stars to be printed for every row
        for (int i = 0; i < numberOfRows / 2; i++) {
            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*"); // Printing in same line
            }
            numberOfStars++; // Increasing number of stars for next row
            System.out.println(); // Changing line here
        }
        numberOfStars--; // Decreasing value to counter last updated value
        // Keep decreasing number of stars to be printed for every row
        for (int i = 0; i < numberOfRows / 2; i++) {
            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*"); // Printing in same line
            }
            numberOfStars--; // Decreasing number of stars for next row
            System.out.println(); // Changing line here
        }

        // Modified version of the above pattern
        // In this method inner loop is dependent of outer loop for number of stars to be printed

        // Increasing pattern
//        for (int i = 1; i <= numberOfRows / 2; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*"); // Printing in same line
//            }
//            System.out.println(); // Changing line here
//        }
//        // Decreasing pattern
//        for (int i = numberOfRows / 2; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*"); // Printing in same line
//            }
//            System.out.println(); // Changing line here
//        }
    }
}
