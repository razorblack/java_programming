public class Problem7 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    /**
     * Time O(log 10 (Integer.MaxValue))
     * @param x input
     * @return number in reverse
     * if integer is overflow while reversing then 0
     */
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) x *= -1;

        int rev = 0;
        while (x > 0) {
            int rem = x % 10;
            x /= 10;

            // Check for overflow
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && rem > 7)) {
                return 0;
            }
            rev = rev * 10 + rem;
        }

        if (isNegative) {
            return rev * -1;
        }
        return rev;
    }
}
