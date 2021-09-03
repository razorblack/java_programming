public class Pattern1 {
    public static void main(String[] args) {
        // Variable to store number of stars in each row
        int numberOfStars = 5;
        // Variable to store number of rows in pattern
        int numberOfRows = 5;

        // Logic for pattern
        // An outer loop for number of rows
        // An inner loop for printing stars
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*"); // Printing in same line
            }
            System.out.println(); // Changing line here
        }
    }
}
