import java.util.Arrays;

public class Problem3149 {
    public static void main(String[] args) {
        System.out.println(minimumAverage(new int[]{7,8,3,4,15,13,4,1}));
    }

    // Time Onlogn Space O1
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        float minimumSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length / 2; i++) {
            int j = nums.length - i - 1;
            if (nums[i] + nums[j] < minimumSum) {
                minimumSum = nums[i] + nums[j];
            }
        }
        return minimumSum / 2;
    }
}
