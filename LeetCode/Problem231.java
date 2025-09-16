public class Problem231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }

    /**
     * Approach: Math log
     * Time O1
     * Space Input O1
     * Space Auxiliary O1
     * @param n Input number
     * @return true if n is in power of 2 false otherwise
     * Approach can also be done using loop or recursion
     */
    public static boolean isPowerOfTwo(int n) {
        double res = Math.log10(n) / Math.log10(2);
        return res % 1 == 0;
    }

    /**
     * Approach: Bits property of number in power of 2: n & n-1 == 0
     * Time O1
     * Space Input O1
     * Space Auxiliary O(-)
     * @param n Input number
     * @return true if n is in power of 2 false otherwise
     *
     */
    public static boolean isPowerOfTwo1(int n) {
        if (n <= 0) {
            return false;
        }

        return (n & (n -1)) == 0;
    }
}
