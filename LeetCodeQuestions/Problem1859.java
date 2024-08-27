import java.util.Arrays;
import java.util.Comparator;

public class Problem1859 {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    // Time On Space O1
    public static String sortSentence(String s) {
        String[] words = new String[9];

        for (String word : s.split(" ")) {
            int index = Integer.parseInt(String.valueOf(word.charAt(word.length() - 1))) - 1;
            words[index] = word.substring(0, word.length() -1);
        }

        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            if (word != null ) {
                ans.append(word).append(" ");
            }
        }

        return ans.toString().trim();
    }
}
