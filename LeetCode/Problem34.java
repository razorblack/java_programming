import java.util.Arrays;

public class Problem34 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));
    }

    /**
     * Time 2*O(log n) = O(log n)
     * Space Input On
     * Space Auxiliary O5
     * @param nums Input array
     * @param target target element
     * @return [first, last] index of occurrence of target element
     * Other Approach: Linear On
     * Other Approach: Find the first middle target then do left (up to start)
     *      and right (up to end) linear search to find occurrence: Time O(log n) + O(n/2) + O(n/2) = O (log n) + O (n) = O (n)
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};

        // finding the last occurrence
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // finding the first occurrence
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                ans[0] = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }


        return ans;
    }
}
