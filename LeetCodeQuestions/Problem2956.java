import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem2956 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIntersectionValues(new int[]{2,3,2}, new int[]{1,2})));
    }

    // Time On2 Space O1
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < nums1.length; i++) {
           for (int j = 0; j < nums2.length; j++) {
               if (nums1[i] == nums2[j]) {
                   answer1++;
                   break;
               }
           }
        }

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    answer2++;
                    break;
                }
            }
        }


        return new int[]{answer1, answer2};
    }

    // Time On Space On
    public static int[] findIntersectionValues1(int[] nums1, int[] nums2) {
        boolean[] temp1 = new boolean[101];
        boolean[] temp2 = new boolean[101];

        for (int i = 0; i < nums1.length; i++) {
           temp1[nums1[i]] = true;
        }

        for (int i = 0; i < nums2.length; i++) {
            temp2[nums2[i]] = true;
        }

        int answer1 = 0;
        int answer2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (temp2[nums1[i]] == true) {
                answer1++;
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (temp1[nums2[i]] == true) {
                answer2++;
            }
        }

        return new int[]{answer1, answer2};
    }
}
