import java.math.*;
import java.util.*;

public class RSA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // The number to be encrypted and decrypted
        System.out.println("Enter the number to be encrypted:");
        int msg = scanner.nextInt();
        System.out.println("Enter first prime number:");
        int p = scanner.nextInt();
        System.out.println("Enter second prime number:");
        int q = scanner.nextInt();

        int d = 0, e, i;

        int n = p * q;
        int z = (p - 1) * (q - 1);
        System.out.println("The value of z = " + z);

        for (e = 2; e < z; e++) {
            // e is for public key exponent
            if (gcd(e, z) == 1) {
                break;
            }
        }
        System.out.println("The value of e = " + e);
        for (i = 0; i <= 9; i++) {
            int x = 1 + (i * z);
            // d is for private key exponent
            if (x % e == 0) {
                d = x / e;
                break;
            }
        }

        System.out.println("The value of d = " + d);
        double c = (Math.pow(msg, e)) % n;
        System.out.println("Encrypted message is : " + c);

        // converting int value of n to BigInteger
        BigInteger N = BigInteger.valueOf(n);
        // converting float value of c to BigInteger
        BigInteger C = BigDecimal.valueOf(c).toBigInteger();
        BigInteger msgback = (C.pow(d)).mod(N);
        System.out.println("Decrypted message is : " + msgback);
    }

    public static int gcd(int e, int z) {
        if (e == 0)
            return z;
        else
            return gcd(z % e, e);
    }
}