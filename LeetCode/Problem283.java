import java.util.Arrays;

public class Problem283 {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Approach Using Two Pointer
     * Time On
     * Space Input On
     * Space Auxiliary O2
     * @param nums Input array
     * Approach 2: Can be done using another copy array Time On Space Auxiliary On
     */
    public static void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int first = 1;
        int second = 0;

        while (first < nums.length && second < nums.length) {
            if (nums[first] != 0 && nums[second] != 0) {
                first++;
                second++;
            } else if (nums[first] != 0 && nums[second] == 0) {
                nums[second] = nums[first];
                nums[first] = 0;
                first++;
                second++;
            } else if (nums[second] == 0 && nums[first] == 0) {
                first++;
            }
        }
    }
}
