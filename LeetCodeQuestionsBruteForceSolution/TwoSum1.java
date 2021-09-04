// Given an array of integers nums and an integer target, return indices of the two numbers
// such that they add up to target.
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
//
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Output: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] ans = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    break;
                } else if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
