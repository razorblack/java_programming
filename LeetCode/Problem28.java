public class Problem28 {
    public static void main(String[] args) {
        System.out.println(strStr1("mississippi", "issip"));
    }

    /**
     * Approach: Using strings internal methods
     * Time O(n * m) n = lenHaystack, m = lenNeedle
     * Space Input On
     * Space Input O1
     * @param haystack input string
     * @param needle input string
     * @return index
     */
    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }

    /**
     * Approach: Using strings internal methods
     * Time O(n * m) n = lenHaystack, m = lenNeedle
     * This is because the indexOf method internally performs a substring search,
     * which involves iterating through the haystack and comparing substrings of length m at each position.
     * Space Input On
     * Space Input O1
     * @param haystack input string
     * @param needle input string
     * @return index
     */
    public static int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
