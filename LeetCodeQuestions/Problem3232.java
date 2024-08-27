public class Problem3232 {
    public static void main(String[] args) {
        System.out.println(canAliceWin(new int[]{1,2,3,4,10}));
    }

    // Time On Space O1
    public static boolean canAliceWin(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                singleSum += nums[i];
            } else {
                doubleSum += nums[i];
            }
        }

        return singleSum != doubleSum;
    }
}
