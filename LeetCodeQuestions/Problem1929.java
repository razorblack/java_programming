import java.util.Arrays;

/**
 * Concatenation of an array
 */
public class Problem1929 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
    }

    // Time - On Space - On
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < 2 * nums.length; i++) {
            ans[i] = nums[i % nums.length];
        }

        return ans;
    }

    public static int[] getConcatenation1(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < 2 * nums.length; i++) {
            if (i < nums.length) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - nums.length];
            }
        }
        return ans;
    }
}
