import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Problem2418 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170})));
    }

    // Time On2 Space O1 : Better Sorting algorithm less time complexity
    public static String[] sortPeople(String[] names, int[] heights) {

        for (int i = 0; i < heights.length; i++) {
            for (int j = i +1; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                    String temp1 = names[i];
                    names[i] = names[j];
                    names[j] = temp1;
                }
            }
        }

        return names;
    }

}
