import java.util.Arrays;

public class Project1816 {
    public static void main(String[] args) {
        System.out.println(truncateSentence2("Hello how are you Contestant", 4));
    }

    // Time On Space On
    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");

        if (words.length == k) {
            return s;
        } else {
            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < k; i++) {
                ans.append(words[i] + " ");
            }

            return ans.toString().trim();
        }
    }

    // Time On Space O1
    public static String truncateSentence1(String s, int k) {

        StringBuilder ans = new StringBuilder();
        int wordCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ans.append(ch);
            if (ch == ' ') {
                wordCount++;
            }

            if (wordCount == k) {
                break;
            }
        }

        return ans.toString().trim();
    }

    // Time On Space O1: Better than above
    public static String truncateSentence2(String s, int k) {

        int wordCount = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }

            if (wordCount == k) {
                break;
            }
        }

        return s.substring(0, i);
    }
}
