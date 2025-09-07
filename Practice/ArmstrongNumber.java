public class ArmstrongNumber {
    public static void main(String[] args) {
        // Armstrong number 371 with number of digits 3
        // 3 ^ 3 + 7 ^ 3 + 1 ^ 3 = 371
        System.out.println(isArmstrong(371));
    }

    /**
     * Time O(log10 n)
     * Space Input O(1)
     * Space Auxiliary O(4)
     * @param n input
     * @return true if n is armstrong, false otherwise
     */
    private static boolean isArmstrong(int n) {
        int digitsCount = (int) Math.log10(n) + 1; // Math formula instead of loop O(log10 n) complexity
        int nBackup = n;
        int powerSum = 0;
        while (n > 0) {
            int rem = n % 10;
            powerSum += Math.pow(rem, digitsCount);
            n /= 10;
        }

        return nBackup == powerSum;
    }
}
