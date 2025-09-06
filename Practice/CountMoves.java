import java.util.Scanner;

public class CountMoves {

    public static int sum(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static long countMoves(long A, int B) {
        int s = sum(A);

        if (A < B) {
            return 0;
        }

        long count = 0;

        while (s > B) {
            A++;
            s = sum(A);
            count++;
        }


        return count;

    }

    public static void main(String[] args) {
        System.out.println(countMoves(555,10));
    }
}
