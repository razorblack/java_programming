public class Pattern4 {
    public static void main(String[] args) {
        // Variable to store number of rows in pattern
        int numberOfRows = 5;
        // Variable to store numbers to be printed
        int numbers = 1;

        // Logic for pattern
        // An outer loop for number of rows
        // An inner loop for printing numbers
        // Keep increasing numbers to be printed for every row
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 1; j <= numbers; j++) {
                System.out.print(j + " "); // Printing in same line
            }
            numbers++; // Increasing numbers for next row
            System.out.println(); // Changing line here
        }

        // Modified version of the above pattern
        // In this inner loop is dependent of outer loop for number of stars to be printed
//        for (int i = 1; i <= numberOfRows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " "); // Printing in same line
//            }
//            System.out.println(); // Changing line here
//        }
    }
}
