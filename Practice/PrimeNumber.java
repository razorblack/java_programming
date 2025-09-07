public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(isPrime1(7));
    }

    /**
     * Time O(n)
     * Space Input O(1)
     * Space Auxiliary O(1)
     * @param n input
     */
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
       int numberOfDivisor = 0;
       for (int i = 1; i <= n; i++) {
           if (n % i == 0) {
               numberOfDivisor++;
           }
       }

       return numberOfDivisor == 2;
    }


    /**
     * Time O(sqrt n)
     * Space Input O(1)
     * Space Auxiliary O(n)
     * @param n input
     */
    private static boolean isPrime1(int n) {
        if (n <= 1) return false;
        int numberOfDivisor = 0;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                numberOfDivisor++;
            }
        }

        return numberOfDivisor == 0;
    }
}
