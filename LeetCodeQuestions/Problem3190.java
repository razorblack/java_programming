public class Problem3190 {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,2,3,4}));
    }

    // Time On Space O1
    public static int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                count++;
            }
        }
        return count;
    }
}
