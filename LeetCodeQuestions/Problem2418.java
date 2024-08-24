import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Problem2418 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople1(new String[]{"Mary","John","Emma"}, new int[]{180,165,170})));
    }

    // Time On2 Space O1
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

    // Time O nlogn Space On
    public static String[] sortPeople1(String[] names, int[] heights) {
        // Create a map to store the index of each element in arrayB
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            indexMap.put(names[i] + ":" + heights[i], heights[i]);
        }

        // Sort arrayA based on the index in indexMap
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(indexMap.get(o2), indexMap.get(o1));
            }
        });

        return names;
    }
}
