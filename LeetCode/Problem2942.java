import java.util.ArrayList;
import java.util.List;

public class Problem2942 {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"leet","code"}, 'e'));
    }

    // Time On Space On
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x)!= -1) {
                list.add(i);
            }
        }

        return list;
    }
}
