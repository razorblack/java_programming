import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Divisor {
    public static void main(String[] args) {
        System.out.println(divisor(36));
        System.out.println(divisor1(36));
    }

    /**
     * Time O(n)
     * Space Input O(1)
     * Space Auxiliary O(n)
     * @param n input
     */
    private static Set<Integer> divisor(int n) {
        Set<Integer> divisors = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    /**
     * Time O(sqrt N)
     * Space Input O(1)
     * Space Auxiliary O(2*Sqrt N) -> O(sqrt N)
     * @param n input
     */
    private static Set<Integer> divisor1(int n) {
        Set<Integer> divisors = new HashSet<>();
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        return divisors;
    }
}
