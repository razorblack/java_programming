public class PalinString {

    static boolean isPalin(String str) {
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else if (str.equals("")) {
            return true;
        } else {
            str = str.substring(1, str.length() - 1);
            return isPalin(str);
        }
    }

    public static void main(String[] args) {
        String str = "abcba";

        System.out.println(isPalin(str));
    }
}
