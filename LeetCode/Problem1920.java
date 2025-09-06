import java.util.Arrays;

public class Problem1920 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray1(new int[]{0,2,1,5,3,4})));
    }

    // Time On Space On
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // Time On Space O1 but time taken is more than the above solution
    public static int[] buildArray1(int[] nums) {
        int mod = 2000;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + (mod * (nums[nums[i]] % mod));
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / mod;
        }
        return nums;
    }
}
