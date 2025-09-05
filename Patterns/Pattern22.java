public class Pattern22 {
    public static void main(String[] args) {
        pattern(5);
    }

    /**
     * Time O(n)
     * Space Input O(1)
     * Space Auxiliary O(2)
     * @param n
     */
    private static void pattern(int n) {
        String row = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                row = "0 " + row;
            } else {
                row = "1 " + row;
            }
            System.out.println(row);
        }
    }
}
