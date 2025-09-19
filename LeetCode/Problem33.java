public class Problem33 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
    }

    /**
     * Approach Binary search with additional logic for part identification
     * Time O(log n)
     * Space Input On
     * Space Auxiliary O3
     * @param nums input array
     * @param target element to find if present, if not then the index
     * @return index if element is present in array, otherwise -1
     * Can also be done using linear search with Time On
     */
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }


            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
