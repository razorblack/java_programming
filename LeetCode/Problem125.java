public class Problem125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));
    }

    /**
     * Time O(n)
     * Space Input O(1)
     * Space Auxiliary O(4)
     * @param s input
     */
    public static boolean isPalindrome1(String s) {
        // Lower casing
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char first = s.charAt(start);
            char last = s.charAt(end);
            if (!Character.isLetterOrDigit(first)) {
                start++;
            } else if (!Character.isLetterOrDigit(last)) {
                end--;
            } else if (first != last) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    /**
     * Time O(n^2) in loop logic
     * Time O(n^2) in recursion logic
     * Time O(n) in recursion logic with StrinBuilder in parse
     * Space Input O(1)
     * Space Auxiliary O(5) in loop logic
     * Space Auxiliary O(n) in recursion logic
     * @param s input
     */
    public static boolean isPalindrome(String s) {
        // Lower casing
        s = s.toLowerCase();

        s = parse1(s);
        if (s.trim().isEmpty()) {
            return true;
        }

//        return checkRecursion(s, 0, s.length() - 1);

        return check(s);
    }

    private static boolean check(String s) {
        int len = s.length();
        int start = 0;
        int end = len - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean checkRecursion(String s, int start, int end) {
        int len = s.length();
        if (start > end) {
            return true;
        } else if (s.charAt(start) != s.charAt(end)) {
            return false;
        } else {
            return checkRecursion(s, start + 1, end - 1);
        }
    }

    private static String parse(String str) {
        String parsed = "";
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if ((ascii >= 97 && ascii <= 122) || (ascii >= 48 && ascii <= 57)) {
                parsed += str.charAt(i);
            }
        }

        return parsed;
    }

    private static String parse1(String str) {
        StringBuilder parsed = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if ((ascii >= 97 && ascii <= 122) || (ascii >= 48 && ascii <= 57)) {
                parsed.append(str.charAt(i));
            }
        }

        return parsed.toString();
    }
}
