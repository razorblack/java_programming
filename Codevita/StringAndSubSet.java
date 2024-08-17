import java.util.Arrays;
import java.util.Scanner;

public class StringAndSubSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        byte N = scanner.nextByte();
        long R = scanner.nextLong();
        scanner.nextLine();
        String str = scanner.nextLine();

        // Logic
        String[] arr = str.split(",");
        System.out.println(Arrays.toString(arr));
        long numberOfSubsets = (long) (Math.pow(2,N));
        String[] subsets = new String[(int)numberOfSubsets];
        long subsetIndex = 0;

        if (R > numberOfSubsets) {
            System.out.println("-1");
        } else {
            String subset = "";
            for (int i = 0; i < N; i++) {
                int temp = factorial(N) / (factorial(i) * factorial(N -i));


            }
            System.out.println(subset);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
