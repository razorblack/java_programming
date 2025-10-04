public class Problem191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }

    public static int hammingWeight(int n) {
        String binaryRep = Integer.toBinaryString(n);
        int counter = 0;
        for (int i = 0; i < binaryRep.length(); i++) {
            if (binaryRep.charAt(i) == '1') {
                counter++;
            }
        }
        return counter;
    }
}
