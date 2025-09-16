import java.util.HashMap;
import java.util.Map;

public class Problem169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }


    /**
     * Approach: Frequency map to find the max frequency
     * Time On
     * Space Input On
     * Space Auxiliary On
     * @param nums input array
     * @return element which occur more than nums.length/2
     * Approach 2: Can also be done using
     */
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (frequency.containsKey(nums[i])) {
                frequency.put(nums[i], frequency.get(nums[i]) + 1);
            } else {
                frequency.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
