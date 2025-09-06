public class Problem1662 {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }

    // Time On Space O1
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";

        for (int i = 0; i < word1.length; i++) {
            s1 += word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            s2 += word2[i];
        }

        return s1.equals(s2);
    }

    // Time On Space O1 : Faster than above (using StringBuilder)
    public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            s1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            s2.append(word2[i]);
        }

        return s1.toString().equals(s2.toString());
    }
}
