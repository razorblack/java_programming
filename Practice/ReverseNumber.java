public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse1(123400));
    }

    /**
     * Time O(log10 N)
     * Space Input O(1)
     * Space Auxiliary O(1)
     * @param n input
     */
    private static int reverse1(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        return rev;
    }

    /**
     * Time O(n)
     * Space Input O(1)
     * Space Auxiliary O(n)
     * @param n input
     */
    private static int reverse(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n);
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());
    }
}
