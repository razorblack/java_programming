import java.util.ArrayList;
import java.util.Scanner;

public class Position {
    public static void main(String[] args) {
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking input
        long N = scanner.nextLong();

        // Logic for problem
        long row = rowNumber(N); // row in which N belong

        ArrayList<ArrayList<Character>> sequence = new ArrayList<>();
        // Initial values
        ArrayList<Character> temp1 = new ArrayList<>();
        temp1.add('a');
        sequence.add(temp1);
        temp1.add('b');
        sequence.add(temp1);


        for (long i = 2; i < row; i++) {
            sequence.add(updateSequence(sequence.get((int) (i - 1))));
        }

        // Output
        long index = (long) (N - Math.pow(2, row - 1)); // Index of Nth occurrence
        System.out.println(sequence.get((int) row - 1).get((int) (index)));
    }

    // Method to return expected row number of N in expanding sequence
    public static long rowNumber(long n) {
        for (long i = 0; i < n / 2 + 1; i++) {
            if (n < Math.pow(2, i)) {
                return i;
            }
        }
        return 0;
    }

    // Method to return the updated sequence by given conditions
    public static ArrayList<Character> updateSequence(ArrayList<Character> s) {
        ArrayList<Character> result = new ArrayList<>(); // To store update sequence

        for (char ch: s) {
            if (ch == 'a' || ch == 'd') {
                result.add('a');
                result.add('b');
            } else if (ch == 'b' || ch == 'c') {
                result.add('c');
                result.add('d');
            }
        }

        // Return update sequence
        return result;
    }
}
