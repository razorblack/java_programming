package recursion;

public class Counting {

    public static void main(String[] args) {
//        countIncremental(1, 5);
//        countIncremental1(5, 5);
        countDecremental1(1, 5);
    }

    /**
     * Time On
     * Space Input O1
     * Space Auxiliary On
     * @param n number
     */
    private static void countDecremental(int n) {
        if (n == 0) return;

        System.out.println(n);
        countDecremental(n -1);
    }

    /**
     * Backtracking approach
     * Time On
     * Space Input O1
     * Space Auxiliary On
     * @param n number
     */
    private static void countDecremental1(int start, int n) {
        if (start > n) return;

        countDecremental1(start + 1, n);
        System.out.println(start);
    }

    /**
     * Time On
     * Space Input O1
     * Space Auxiliary On
     * @param start counter
     * @param n number
     */
    private static void countIncremental(int start, int n) {
        if (start > n) return;

        System.out.println(start);
        countIncremental(start + 1, n);
    }

    /**
     * Backtracking approach: Printing number after recursive call
     * Time On
     * Space Input O1
     * Space Auxiliary On
     * @param start counter
     * @param n number
     */
    private static void countIncremental1(int start, int n) {
        if (start < 1) return;

        countIncremental1(start - 1, n);
        System.out.println(start);
    }
}
