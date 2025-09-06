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
import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {
        int[] ans = twoSum3(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(ans)); // [0,1] or [1,0]
    }

    // In time On2 and space O1
    public static int[] twoSum1(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        // Will not occur as exactly one solution will be there
        return ans;
    }

    // In time On and space On
    public static int[] twoSum2(int[] nums, int target) {

        if (nums.length == 2) {
            return new int[]{0, 1};
        } else {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }

            for (int j = 0; j < nums.length; j++) {
                int otherPart = target - nums[j];

                if (map.containsKey(otherPart) && map.get(otherPart) != j) {
                    return new int[]{j, map.get(otherPart)};
                }
            }
            return null;
        }
    }


    // In time On and space On
    public static int[] twoSum3(int[] nums, int target) {

        if (nums.length == 2) {
            return new int[]{0, 1};
        } else {
            Map<Integer, Integer> map = new HashMap<>();

            // As order doesn't matter we can combine the two iteration
            for (int i = 0; i < nums.length; i++) {
                int otherPart = target - nums[i];

                if (map.containsKey(otherPart) && map.get(otherPart) != i) {
                    return new int[]{i, map.get(otherPart)};
                }
                map.put(nums[i], i);
            }
            return null;
        }
    }
}
