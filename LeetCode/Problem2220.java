public class Problem2220 {
    public static void main(String[] args) {
        System.out.println(minBitFlips(10, 7));
    }

    // Time On Space O1 : Using Bit manipulation time can be reduced
    public static int minBitFlips(int start, int goal) {
        String startBinary = Integer.toBinaryString(start);
        String goalBinary = Integer.toBinaryString(goal);
        if (startBinary.equals(goalBinary)) {
            return 0;
        }

        startBinary = String.format("%11s", startBinary).replace(' ', '0');
        goalBinary = String.format("%11s", goalBinary).replace(' ', '0');



        int bitFlipNeeded = 0;
        for (int i = startBinary.length() - 1; i >= 0; i--) {
            char ch = startBinary.charAt(i);
            char ch1 = goalBinary.charAt(i);
            if (ch != ch1) {
                bitFlipNeeded++;
            }
        }
        return bitFlipNeeded;
    }


}
