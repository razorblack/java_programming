public class Pattern31 {
    public static void main(String[] args) {
        pattern1(4);
    }

    /**
     * Time O(n^2)
     * Space Input O(1)
     * Space Auxiliary O()
     * @param n input
     *
     */
    private static void pattern1(int n) {
        // Logic
        // Assume a matrix is present with values to be subtracted from n to get the required value in pattern
        // As that matrix is also dynamically generated so get the pattern of their values
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n -1; j++) {
                // Pattern of values
                int topDistance = i;
                int leftDistance = j;
                int rightDistance = (2 * n -1) -1 - j;
                int bottomDistance = (2 * n - 1) -1 - i;
                int value = n - Math.min(Math.min(topDistance, bottomDistance), Math.min(leftDistance, rightDistance));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
