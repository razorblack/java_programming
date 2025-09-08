public class Problem1752 {
    public static void main(String[] args) {
        System.out.println(check(new int[]{1, 2, 3}));
        System.out.println(check(new int[]{2,7,4,1,2,6,2}));
        System.out.println(check(new int[]{3,4,5,1,2}));
    }

    /**
     * Approach: Loop Iteration over array
     * Time On
     * Space Input On
     * Space Auxiliary O(3)
     * @param nums Input Array
     * @return true/false
     */
    public static boolean check(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return true;
        }


        // Finding first decrement index
        int pivot = -1;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                pivot = i + 1;
                break;
            }
        }
        if (pivot == -1) return true;


        for (int i = pivot; i < len - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        for (int i = 0; i < pivot - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        if (nums[len - 1] > nums[0]) {
            return false;
        }
        return true;
    }
}
