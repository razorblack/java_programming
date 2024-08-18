/**
 * Score of a string
 */
public class Problem3110 {

    public static void main(String[] args) {
        String s = "zaz";
        System.out.println(scoreOfString(s));
    }
    public static int scoreOfString(String s) {
        int count = 0;
        for (int i = 0; i < s.length() -1; i++) {
            count += Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
        }
        return count;
    }
}
