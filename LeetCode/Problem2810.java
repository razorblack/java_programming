public class Problem2810 {
    public static void main(String[] args) {
        System.out.println(finalString1("poiinteri"));
    }

    // Time On Space O1
    public static String finalString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1) {
                if (s.charAt(i) == 'i') {
                    StringBuilder reverse = new StringBuilder(s.substring(0, i));
                    reverse.reverse();
                    s = reverse.append(s.substring(i + 1)).toString();
                    i--;
                }
            } else {
                if (s.charAt(i) == 'i') {
                    StringBuilder reverse = new StringBuilder(s.substring(0, i));
                    s = reverse.reverse().toString();
                }
            }
        }
        return s;
    }

    // Time On Space O1: Less time than above method
    public static String finalString1(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                ans.reverse();
            } else {
                ans.append(s.charAt(i));
            }

        }
        return ans.toString();
    }
}
