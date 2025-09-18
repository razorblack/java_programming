public class Problem35 {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 0));
    }

    /**
     * Time O(log n)
     * Space Input On
     * Space Auxiliary O3
     * @param nums input array
     * @param target element to find if present, if not then the index
     * @return index if element is present in array, otherwise its index it should be present
     * Can also be done using linear search with Time On
     */
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int probableIndex = nums.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
                probableIndex = mid;
            } else {
                start = mid + 1;
            }
        }
        return probableIndex;
    }
}
