import java.util.Arrays;
import java.util.Collections;

public class Problem2022 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(construct2DArray(new int[]{1,2}, 1, 1)));
    }

    // Time On2 Space On
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length > (m * n)) {
            return new int[1][1];
        }
        int[][] ans = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[index];
                index++;
            }
        }

        return ans;
    }
}
