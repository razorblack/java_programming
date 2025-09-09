import java.util.Arrays;

public class Problem189 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate2(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Time On
     * Space input On
     * Space Auxiliary On
     * @param nums input array
     * @param k pivot
     */
    public static void rotate(int[] nums, int k) {
        int len = nums.length;

        if (k == 0 || k % len == 0) {
            return;
        }

        k = k % len;

        int[] copy = new int[len];

        // Copy Array
        for (int i = 0; i < len; i++) {
            copy[i] = nums[i];
        }

        int index = 0;
        for (int i = len - k; i < len; i++) {
            nums[index] = copy[i];
            index++;
        }

        for (int i = 0; i < len - k; i++) {
            nums[index] = copy[i];
            index++;
        }
    }


    /**
     * Time On^2
     * Space input On
     * Space Auxiliary O2
     * @param nums input array
     * @param k pivot
     */
    public static void rotate1(int[] nums, int k) {
        int len = nums.length;

        if (k == 0 || k % len == 0) {
            return;
        }

        k = k % len;

        for (int i = 1; i <= k; i++) {
            int temp = nums[len - 1];
            for (int j = len -1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

    /**
     * Two pointer out of the box
     * Time On
     * Space input On
     * Space Auxiliary O2
     * @param nums input array
     * @param k pivot
     */
    public static void rotate2(int[] nums, int k) {
        int len = nums.length;

        if (k == 0 || k % len == 0) {
            return;
        }

        k = k % len;

        // Reverse the entire array
        reverse(nums, 0, len - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, len - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
