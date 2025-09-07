import java.util.HashMap;
import java.util.Map;

public class Problem509 {
    public static void main(String[] args) {
        System.out.println(fib1(12, new HashMap<>()));
        System.out.println(fib3(12));
    }

    /**
     * Dynamic programming implementation
     * Time O(n)
     * Space Input O(1)
     * Space Auxiliary O(4)
     * @param n input
     */
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0; // First number of fibonacci
            int b = 1; // Second number of fibonacci
            int c = a + b;
            int count = 2;
            while (count <= n) {
                c = a + b;
                a = b;
                b = c;
                count++;
            }
            return c;
        }
    }


    /**
     * Recursion with memoization
     * Time O(n)
     * Space Input O(1)
     * Space Auxiliary O(n)
     * @param n input
     */
    public static int fib1(int n, Map<Integer, Integer> memo) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo.containsKey(n)) {
            // Check if the result is already computed
            return memo.get(n);
        } else {
            // Compute and store the result in the memo map
            int result = fib1(n - 1, memo) + fib1(n - 2, memo);
            memo.put(n, result);

            return result;
        }
    }

    /**
     * Recursion Normal
     * Time O(2 ^ n): The method makes two recursive calls for each non-base case
     * Space Input O(1)
     * Space Auxiliary O(1)
     * @param n input
     */
    public static int fib2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib2(n -1) + fib2(n - 2);
        }
    }

    /**
     * Mathematics: Using Binet's formula to find nth fibonacci sequence
     * Time O(1)
     * Space Input O(1)
     * Space Auxiliary O(1)
     * @param n input
     */
    public static int fib3(int n) {
        // phi -> golden ratio
        double phi = 1.618;
        double negativePhi = -0.618;
        double denominator = Math.sqrt(5);
        double numerator = Math.pow(phi, n) - Math.pow(negativePhi, n);
        return (int) Math.ceil(numerator / denominator);
    }
}
