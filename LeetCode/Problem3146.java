import java.util.HashMap;
import java.util.Map;

public class Problem3146 {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference1("abc", "bac"));
    }

    // Time On Space On
    public static int findPermutationDifference(String s, String t) {
        Map<Character, Integer> sCharIndexMap = new HashMap<>();
        Map<Character, Integer> tCharIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sCharIndexMap.put(s.charAt(i), i);
            tCharIndexMap.put(t.charAt(i), i);
        }
        int permutationDifference = 0;
        for (int i = 0; i < s.length(); i++) {
            permutationDifference += Math.abs(sCharIndexMap.get(s.charAt(i)) - tCharIndexMap.get(s.charAt(i)));
        }

        return permutationDifference;
    }


    // Time On Space O1
    public static int findPermutationDifference1(String s, String t) {
        int permutationDifference = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int tIndex = t.indexOf(ch);
            permutationDifference += Math.abs(i - tIndex);
        }

        return permutationDifference;
    }
}
