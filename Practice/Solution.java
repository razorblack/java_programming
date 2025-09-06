import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {

        if (s.equals(t)) {
            return true;
        }

        Map<Character, Character> keyMap = new HashMap();
        Map<Character, Character> valueMap = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            if (!keyMap.containsKey(s.charAt(i))){
                keyMap.put(s.charAt(i), t.charAt(i));
            }

            if (!valueMap.containsKey(t.charAt(i))){
                valueMap.put(t.charAt(i), s.charAt(i));
            }
        }

        return true;

    }

    public static boolean backspaceCompare(String s, String t) {

        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                sBuilder.append(s.charAt(i));
            } else {
                if (sBuilder.length() >= 1) sBuilder.deleteCharAt(sBuilder.length() - 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                tBuilder.append(t.charAt(i));
            } else {
                if (tBuilder.length() >= 1) tBuilder.deleteCharAt(tBuilder.length() - 1);
            }
        }

        return sBuilder.toString().equals(tBuilder.toString());
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##", "c#d#"));
    }

}
