import java.util.Arrays;

public class Problem3131 {
    public static void main(String[] args) {
        System.out.println(addedInteger1(new int[]{2,6,4}, new int[]{9,7,5}));
    }

    // Time Onlogn Space O1
    public static int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
    }

    // Time On Space O1
    public static int addedInteger1(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < min1) {
                min1 = nums1[i];
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] < min2) {
                min2 = nums2[i];
            }
        }

        return min2 - min1;
    }
}
