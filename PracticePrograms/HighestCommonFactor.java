/**
 * Highest Common Factor or
 * Greatest Common Divisor
 */
public class HighestCommonFactor {
    public static void main(String[] args) {
        gcd2(9, 12);

        System.out.println(gcd3(24, 18));
    }

    /**
     * Time O(min(n1, n2))
     * Space Input O(2)
     * Space Auxiliary O(2)
     * @param n1 input1
     * @param n2 input2
     */
    private static void gcd1(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    /**
     * Time O(min(n1, n2))
     * Reverse iteration will take less iteration than the above approach of forward iteration
     * Space Input O(2)
     * Space Auxiliary O(2)
     * @param n1 input1
     * @param n2 input2
     */
    private static void gcd2(int n1, int n2) {
        int gcd = 1;
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }

    /**
     * Time O(min(n1, n2))
     * This approach is Euclidean Algorithm of finding GCD
     * Space Input O(2)
     * Space Auxiliary O(2)
     * @param n1 input1
     * @param n2 input2
     *        n1 > n2
     */
    private static int gcd3(int n1, int n2) {
        if (n2 == 0) return n1;

        return gcd3(n2, n1 % n2);
    }
}
