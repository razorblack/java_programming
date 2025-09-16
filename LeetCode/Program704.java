public class Program704 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{5}, 5));
    }

    /**
     * Time O(log n)
     * Space Input On
     * Space Auxiliary O3
     * @param nums input array
     * @param target element to find
     * @return index if element is present in array, otherwise -1
     */
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
