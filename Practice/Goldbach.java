import java.util.Scanner;

public class Goldbach {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = ob.nextInt();
        if (N % 2 != 0) {
            System.out.println("INVALID INPUT.NUMBER IS ODD");
        } else if (N <= 9 || N >= 50) {
            System.out.println("INVALID INPUT.NUMBER OUT OF RANGE");
        } else {
            System.out.println("PRIME PAIRS ARE:");
            for (int i = 3; i < N / 2 + 1; i++) {
                if (prime(i) == 1) {
                    for (int j = 3; j < N; j++) {
                        if (prime(j) == 1) {
                            if (i + j == N) {
                                System.out.println(i + "," + j);
                            }
                        }
                    }
                }
            }
        }
    }

    public static int prime(int n) {
        if (n <= 1) {
            return 0;
        }
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}