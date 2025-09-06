import java.util.Arrays;

public class Problem1672 {
    public static void main(String[] args) {
        System.out.println(maximumWealth1(new int[][]{{1,2,3}, {3,2,1}}));
    }

    // Time On2 Space O1
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = -1;
        int m = accounts.length;
        int n = accounts[0].length;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += accounts[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    // Time On2 Space O1
    public static int maximumWealth1(int[][] accounts) {
        return Arrays.stream(accounts)
                .mapToInt(account -> Arrays.stream(account).sum())
                .max()
                .getAsInt();
    }
}
