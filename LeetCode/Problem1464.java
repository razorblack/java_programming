public class Problem1464 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,4,5,2}));
    }

    // Time On Space O1
    public static int maxProduct(int[] nums) {
        int max = 1;
        int secondMax = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondMax) {
                secondMax = nums[i];
            }

            if (secondMax > max) {
                int temp = secondMax;
                secondMax = max;
                max = temp;
            }
        }

        return (max - 1) * (secondMax - 1);
    }
}
