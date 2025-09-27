public class Problem27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }

    /**
     * Approach: Array Iteration  with 2 pointers
     * Time On
     * Space Input On
     * Space Auxiliary On
     * @param nums Input Array
     * @param val value to find
     * @return number of elements which aren't equal to val in nums
     * Approach: Can also be done using full iteration and swapping
     */
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int ans = 0;
        int first = 0;
        int second = nums.length - 1;
        while (first <= second) {
            if (nums[first] != val) {
                ans++;
                first++;
            } else {
                int temp = nums[second];
                nums[second] = nums[first];
                nums[first] = temp;
                second--;
            }
        }

        return ans;
    }
}
