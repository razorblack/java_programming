public class Problem121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    /**
     * Approach Linear while maintaining the max profit received
     * Time On
     * Space Input On
     * Space Auxiliary O5
     * @param prices input array of stock prices
     * @return max profit can be made
     */
    public static int maxProfit(int[] prices) {
        int profit = 0;

        if (prices.length == 0) {
            return profit;
        }
        int buy = 0;
        int sell = 0;
        for (int i = 1; i < prices.length; i++) {
            sell = i;
            if (prices[sell] > prices[buy]) {
                int temp = prices[sell] - prices[buy];
                profit = Math.max(temp, profit);
            } else if (prices[i] < prices[buy]) {
                buy = i;
            }
        }
        return profit;
    }
}
