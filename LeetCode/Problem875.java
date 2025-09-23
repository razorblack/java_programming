public class Problem875 {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed1(new int[]{312884470}, 312884469));
    }

    /**
     * Time O(N + MaxElement* On) -> On^2
     * Space Input On
     * Spcae Auxiliary O5
     * @param piles input array
     * @param h hour
     * @return min capacity of eating per hour
     */
    public static int minEatingSpeed(int[] piles, int h) {

        // Finding the max element
        int maxElement = -1;
        for (int i = 0; i < piles.length; i++) {
            maxElement = Math.max(maxElement, piles[i]);
        }

        // Trying for number 1 to max element
        for (int k = 1; k <= maxElement; k++) {
            if (timeTookToEat(piles, k) <= h) {
                return k;
            }
        }

        return -1;
    }

    private static int timeTookToEat(int[] piles, int k) {
        int hoursTook = 0;
        for (int i = 0; i < piles.length; i++) {
            hoursTook += Math.ceil((double) piles[i] / k);
        }

        return hoursTook;
    }


    /**
     * Time O(N +  O (N * log (MaxElement)) -> O(Nlogn)
     * Space Input On
     * Spcae Auxiliary O5
     * @param piles input array
     * @param h hour
     * @return min capacity of eating per hour
     */
    public static int minEatingSpeed1(int[] piles, int h) {
        // Finding the max element
        int maxElement = -1;
        for (int i = 0; i < piles.length; i++) {
            maxElement = Math.max(maxElement, piles[i]);
        }

        // Trying for number 1 to max element
        int k = Integer.MAX_VALUE;
        int start = 1;
        int end = maxElement;
        while (start <= end) {
            int mid = (start + end) / 2;
            int temp = timeTookToEat(piles, mid);
            if (temp <= h) {
                if (mid > k) {
                    break;
                }
                k = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return k;
    }
}
