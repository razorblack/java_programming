import java.util.HashMap;
import java.util.Map;

public class Problem2325 {
    public static void main(String[] args) {
//        System.out.println((char) 97);
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    // Time On Space On
    public static String decodeMessage(String key, String message) {
        Map<Character, Character> decodeTable = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        int index = 0;
        for (int i = 1; i <= 26; i++) {
            char ch = key.charAt(index);

            if (ch == ' ') {
                i--;
            } else {
                if (!decodeTable.containsKey(ch)) {
                    decodeTable.put(ch, (char) (i + 96));
                } else {
                    i--;
                }

            }

            index++;
        }

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch == ' ') {
                ans.append(ch);
            } else {
                ans.append(decodeTable.get(ch));
            }
        }

        return ans.toString();
    }

}
