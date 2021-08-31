import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // Random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Hey! Can you guess the number between [1-100] in 10 guesses.");
        System.out.println("Let's start! Guess.");

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        boolean isWon = false; // To keep track of success

        // Loop to repeat for 10 guesses
        for (int i = 10; i > 0; i--) {
            int guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Sorry! Number is less than guess");
                System.out.println("You have only " + (i - 1) + " guesses left! Try Again");
            } else if (guess < randomNumber) {
                System.out.println("Sorry! Number is greater than guess");
                System.out.println("You have only " + (i - 1) + " guesses left! Try Again");
            } else {
                isWon = true;
                break;
            }
        }
        if (isWon) {
            System.out.println("Great! You won. The number is " + randomNumber);
        } else {
            System.out.println("No Guesses left. You lost the game!");
            System.out.println("The number is " + randomNumber);
        }
    }
}
