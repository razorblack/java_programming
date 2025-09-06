import java.util.Arrays;

public class Problem2960 {
    public static void main(String[] args) {
        System.out.println(countTestedDevices(new int[]{1,1,2,1,3}));
    }

    // Time On Space O1
    public static int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] > 0) {
                count++;
                performOperation(batteryPercentages, i + 1);
            }
        }

        return count;
    }

    private static void performOperation(int[] arr, int startIndex) {
        for (int j = startIndex; j < arr.length; j++) {
            arr[j] = Math.max(0, arr[j] - 1);
        }
    }
}
