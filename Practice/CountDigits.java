public class CountDigits {
    public static void main(String[] args) {
        logic1(12345);

        logic2(12345);
    }

    /**
     * Time O(1)
     * Space Input O(1)
     * Space Auxiliary O(0)
     * @param n input
     */
    private static void logic2(int n) {
        System.out.println((int) Math.log10(n) + 1);
    }

    /**
     * Time O(n)
     * Space Input O(1)
     * Space Auxiliary O(1)
     * @param n
     */
    private static void logic1(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }

        System.out.println(count);
    }
}
