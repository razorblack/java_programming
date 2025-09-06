import java.util.Arrays;
import java.util.Comparator;

public class Problem14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix1(new String[]{"flower","flow","flight"}));
    }

    // Time On2 Space O1
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String shortestWord = strs[0];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < shortestWord.length(); i++) {
            char ch = shortestWord.charAt(i);
            boolean isPresent = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    isPresent = false;
                    break;
                }
            }

            if (isPresent) {
                ans.append(ch);
            } else {
                break;
            }

        }

        return ans.toString();
    }

    // Time O n log n Space O1
    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);
        String word1 = strs[0];
        String word2 = strs[strs.length - 1];

        if (word1.length() > word2.length()) {
            String temp = word1;
            word1 = word2;
            word2 = temp;
        }
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);

            if (word2.charAt(i) == ch) {
                ans.append(ch);
            } else {
                break;
            }
        }

        return ans.toString();
    }
}
