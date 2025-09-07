public class Problem9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome1(14221));
    }

    /**
     * Time O(n) using stringBuilder reverse operation, internally it uses O(n)
     * Operation on string make program slow
     * Space Input O(1)
     * Space Auxiliary O(n)
     * @param x input
     * @return true if x is palindrome, false otherwise
     */
    private static boolean isPalindrome1(int x) {
        if (x < 0) return false;
        if (x == 0) return true;

        int digits = (int) Math.log10(x) + 1;
        String number = String.valueOf(x);
        int mid = digits / 2;
        String fistHalf = number.substring(0, mid);
        String secondHalf = number.substring(digits % 2 == 0 ? mid : mid + 1);
        StringBuilder rev = new StringBuilder(secondHalf);
        rev.reverse();
        return fistHalf.equals(rev.toString());
    }

    /**
     * Time O(log10 x)
     * Space Input O(1)
     * Space Auxiliary O(3)
     * @param x input
     * @return true if x is palindrome, false otherwise
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        if (x == 0) return true;

        int xBackup = x;
        int rev = 0;
        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            rev = rev * 10 + rem;
        }
        return xBackup == rev;
    }
}
