import java.util.HashMap;
import java.util.Map;

/**
 * Number of good pairs
 */
public class Problem1512 {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs1(new int[]{1,2,3,1,1,3}));
    }

    // Time On2 Space O1
    public static int numIdenticalPairs(int[] nums) {
        int goodPairCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++ ) {
                if (nums[i] == nums[j]) {
                    goodPairCount++;
                }
            }
        }
        return goodPairCount;
    }

    // Time On Space On
    public static int numIdenticalPairs1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int goodPairCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getValue();
            if (x <= 1) {
                goodPairCount += 0;
            } else if (x == 2) {
                goodPairCount += 1;
            } else {
                goodPairCount+= (x * (x -1)) / 2;
            }
        }
        return goodPairCount;
    }
}
