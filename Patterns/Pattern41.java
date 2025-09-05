public class Pattern41 {
    public static void main(String[] args) {
        pattern1(3);
    }

    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(3)
     * @param n
     */
    private static void pattern1(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
