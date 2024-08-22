public class Problem2000 {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }

    // Time O1 Space O1
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }

        String reversePart = word.substring(0, index + 1);
        StringBuilder stringBuilder = new StringBuilder(reversePart);
        stringBuilder.reverse();
        if (index == word.length() - 1) {
            return stringBuilder.toString();
        }

        String normalPart = word.substring(index + 1);
        return stringBuilder + normalPart;
    }
}
