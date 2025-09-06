import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem2864 {
    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("0101"));
    }

    // Time On Space O1
    public static String maximumOddBinaryNumber(String s) {
        StringBuilder ones = new StringBuilder();
        StringBuilder zeros = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones.append("1");
            } else {
                zeros.append("0");
            }
        }
        return ones.append(zeros).substring(1) + "1";
    }
}
