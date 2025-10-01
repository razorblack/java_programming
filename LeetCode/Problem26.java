public class Problem26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    /**
     * Approach: Array Iteration  with 2 pointers
     * Time On
     * Space Input On
     * Space Auxiliary O2
     * @param nums Input Array
     * @return number of elements which are unique
     * Approach: Can also be done using full iteration and duplicate array Time On Space On
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int replaceIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[replaceIndex] = nums[i];
                replaceIndex++;
            }
        }
        return replaceIndex;
    }
}
