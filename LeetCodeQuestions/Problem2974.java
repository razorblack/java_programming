import java.util.Arrays;

public class Problem2974 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberGame(new int[]{5,4,2,3})));
    }

    // Time On Space On
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i = i + 2) {
            arr[i] = nums[i + 1];
            arr[i +1] = nums[i];
        }

        return arr;

    }

    // Time O n log n Space O1
    public static int[] numberGame1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i +1] = temp;
        }

        return nums;

    }
}
