import java.util.Arrays;

public class Problem1470 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7}, 3)));
    }

    // Time On Space On
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

        int index = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                ans[index]= nums[i];
            } else {
                ans[index] = nums[i + n];
            }
            index++;
        }

        return ans;
    }
}
