import java.math.BigInteger;

public class Problem2710 {
    public static void main(String[] args) {
        System.out.println(removeTrailingZeros1("51230100"));
    }

    // Time On Space O1
    public static String removeTrailingZeros(String num) {
        BigInteger n = new BigInteger(num);

        while (n.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            n = n.divide(BigInteger.TEN);
        }

        return String.valueOf(n);
    }

    public static String removeTrailingZeros1(String num) {
        int index = -1;
        while (num.indexOf('0') != -1) {
            index = num.indexOf('0');

            if (Integer.parseInt(num.substring(index)) == 0) {
                break;
            }

            num = num.substring(index + 1);


        }

        return num.substring(0, index);
    }
}
