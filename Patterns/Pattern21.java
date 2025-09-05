public class Pattern21 {
    public static void main(String[] args) {
        pattern1(5);
    }

    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O(3)
     * @param n input
     */
    private static void pattern1(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
