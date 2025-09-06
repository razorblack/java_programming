import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1431 {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    // Time On Space On
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >=  max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }
}
