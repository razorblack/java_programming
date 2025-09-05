import java.util.HashMap;
import java.util.Map;

public class Problem2006 {
    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{1,2,2,1}, 1));
    }

    // Time On2 Space O1
    public static int countKDifference(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k)
                    count++;
            }
        }
        return count;
    }

    // Time On Space On
    public static int countKDifference1(int[] nums, int k) {
        int count = 0;

        Map<Integer, Integer> valueMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            valueMap.put(i, nums[i]);
        }

        for (int j = 0; j < nums.length; j++) {
            if (valueMap.containsKey(nums[j] - k)){
                count++;
            }

            if (valueMap.containsKey(nums[j] + k)) {
                count++;
            }

        }
        return count;
    }
}
