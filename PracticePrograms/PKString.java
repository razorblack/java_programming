public class PKString {

    static int pkString(int k, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                k--;
            }
        }

        if (k == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(pkString(2, "abphsp"));
    }
}
