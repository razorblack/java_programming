// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
// Return the running sum of nums.
// Example 1:
//
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

import java.util.Arrays;

public class RunningSumOf1DArray1480 {
    public static void main(String[] args) {
        int[] ans = runningSum(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(ans));

    }
    public static int[] runningSum(int[] nums) {
        int[] runningSums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            runningSums[i] = sum;
        }
        return runningSums;
    }
}
