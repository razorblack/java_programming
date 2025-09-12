public class Problem136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
    }

    /**
     * Approach: Properties of XOR operation
     * Time On
     * Space Input On
     * Space Auxiliary O2
     * @param nums input array
     * @return number which appear only 1 time in array
     * Other Approach: Can be done in Time On2 Space O1 nested loop
     * Can be done using Hashmap storing frequency Time On Space On
     */
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
