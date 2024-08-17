// Special Number: It is a positive integer with the GCD of the sum of quartic power
// of its digits and the product of its digits greater than 1.

import java.util.Scanner;

public class SpecialNumberCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte T =  scanner.nextByte();

        for (byte i = 1; i <= T; i++) {
            long n = scanner.nextLong();

            long count = 0;
            for (long j = 1; j <= n; j++) {
                if (special(j)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    public static boolean special(long x) {
        long sum = 0;
        long product = 1;
        while(x > 0) {
            long temp = x % 10;
            product *= temp;
            sum += Math.pow(temp, 4);
            x = x / 10;
        }
        long gcd = gcd(sum, product);

        if (gcd > 1) {
            return true;
        } else {
            return false;
        }
    }

    public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;


        if (a == b)
            return a;
        if (a > b)
            return gcd(a-b, b);
        else
            return gcd(a, b-a);
    }
}
