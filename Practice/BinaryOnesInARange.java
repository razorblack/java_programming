/* Given a non negative integer number num. For every number i in the
  range 0 ≤ i ≤ num calculate the number of 1’s in their binary representation
  and return them as an array.

   INPUT : 5
   OUTPUT: [0,1,1,2,1,2]
 */

import java.util.Arrays;
import java.util.Scanner;

public class BinaryOnesInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();       // Input number
        int[] binaryOnes = new int[num + 1];    // Array to store no of ones in binary of number in range
        for (int i = 0; i <= num; i++) {
            binaryOnes[i] = binaryOnesInANumber(i);
        }
        System.out.println(Arrays.toString(binaryOnes));
    }

    // Method to return no. of ones in a binary
    protected static int binaryOnesInANumber(int n) {
        int numberOfOnes = 0;
        n = decimalToBinary(n);
        while (n > 0) {
            if (n % 10 == 1) {
                numberOfOnes++;
            }
            n = n / 10;
        }
        return numberOfOnes;
    }

    // method to return binary equivalent of a decimal no.
    private static int decimalToBinary(int n) {
        int binary = 0;
        while (n > 0) {
            binary = binary * 10 + (n % 2);
            n = n / 2;
        }
        // Binary number is in reversed order, as for this case we don't need in correct order so it'll work
        return binary;
    }
}
