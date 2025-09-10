import java.util.HashSet;
import java.util.Set;

public class Problem268 {
    public static void main(String[] args) {
        System.out.println(missingNumber4(new int[]{3,0,1}));
    }

    /**
     * Approach: Total Sum of N number - Sum of array
     * Time On
     * Space Input On
     * Space Auxiliary O4
     * @param nums input array
     * @return missing number
     */
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int totalSum = (len * (len + 1)) / 2;
        int arraySum = 0;
        for (int i = 0; i < len; i++) {
            arraySum += nums[i];
        }

        return totalSum - arraySum;
    }

    /**
     * Approach: Nested loop to find out the missing number
     * Time On^2
     * Space Input On
     * Space Auxiliary O4
     * @param nums input array
     * @return missing number
     */
    public static int missingNumber1(int[] nums) {
        int len = nums.length;
        for (int i = 0; i <= len; i++) {
            boolean isPresent = false;
            for (int j = 0; j < len; j++) {
                if (nums[j] == i) {
                    isPresent = true;
                    break;
                }
            }

            if (!isPresent) return i;
        }
        return -1;
    }

    /**
     * Approach: Check which no is not present by removing the number from the collection
     * Time On
     * Space Input On
     * Space Auxiliary On
     * @param nums input array
     * @return missing number
     */
    public static int missingNumber3(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= len; i++) {
            set.add(i);
        }

        for (int i = 0; i < len; i++) {
           set.remove(nums[i]);
        }
        return set.iterator().next();
    }

    /**
     * Approach: Using bitwise XOR properties
     * Time On
     * Space Input On
     * Space Auxiliary O1
     * @param nums input array
     * @return missing number
     */
    public static int missingNumber4(int[] nums) {
        int len = nums.length;
        int xorDefault = 0;
        for (int i = 0; i <= len; i++) {
            xorDefault ^= i;
        }

        int xorArray = 0;
        for (int i = 0; i < len; i++) {
            xorArray ^= nums[i];
        }
        return xorArray ^ xorDefault;
    }
}
