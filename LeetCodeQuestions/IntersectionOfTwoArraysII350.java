import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysII350 {
    public static void main(String[] args) {
        int[] ans = intersect(new int[]{1,2,2,1}, new int[]{2,2});
        System.out.println(Arrays.toString(ans));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans[index] = nums1[i];
                    index++;
                    break;
                }
            }
        }
        int[] ans1 = new int[index];
        for (int i = 0; i < index; i++) {
            ans1[i] = ans[i];
        }
        return ans1;
    }
}
