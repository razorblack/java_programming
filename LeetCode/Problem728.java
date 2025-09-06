import java.util.ArrayList;
import java.util.List;

public class Problem728 {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }


    // Time On2 Space O1
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    private static boolean isSelfDividingNumber(int n) {
        int originalNumber = n;
        while (n > 0) {
            int temp = n % 10;
            if (temp == 0) {
                return false;
            }
            if (originalNumber % temp != 0) {
                return false;
            }

            n /= 10;
        }

        return true;

    }
}
