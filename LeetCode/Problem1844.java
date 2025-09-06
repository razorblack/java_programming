public class Problem1844 {
    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }

    // Time On Space O1
    public static String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                char ch = s.charAt(i - 1);
                char newChar = (char) ((int) ch + Integer.parseInt(String.valueOf(s.charAt(i))));
                str.append(newChar);
            } else {
               str.append(s.charAt(i));
            }
        }

        return str.toString();
    }
}
