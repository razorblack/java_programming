public class Problem1704 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike1("textbook"));
    }

    // Time On Space O1
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int middle = s.length() / 2;
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < middle && isVowel(s.charAt(i))) {
                firstHalf++;
            }

            if (i >= middle && isVowel(s.charAt(i))) {
                secondHalf++;
            }
        }

        return firstHalf == secondHalf;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Time On Space O1
    public static boolean halvesAreAlike1(String s) {
        int middle = s.length() / 2;
        String firstHalf = s.substring(0, middle);
        String secondHalf = s.substring(middle);

        return numberOfVowels(firstHalf) == numberOfVowels(secondHalf);
    }

    private static int numberOfVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        return count;
    }

}
