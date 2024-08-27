public class Problem1732 {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
    }

    // Time On Space O1
    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;

        int currentAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];

            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }

        return maxAltitude;
    }
}
