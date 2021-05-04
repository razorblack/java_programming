/*
Question: Given an array of integers nums, you start with an initial positive value startValue.
         In each iteration, you calculate the step by step sum of the startValue plus elements in nums(from left
          to right). Return the minimum positive value of startValue such that the step by step sum is never less than 1.

Input: nums = [-3, 2, -3, 4, 2]
Output: 5
 */

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter elements of array");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Logic
        int startValue = 0;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] > 0) {
                startValue = nums[i];
            }

            if (startValue > 0 && startValue + nums[i + 1] >= 1) {
                startValue += nums[i + 1];
            }
        }

        System.out.println("Minimum value of the startValue is :" + startValue);
    }
}
