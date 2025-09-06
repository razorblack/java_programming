import java.util.Arrays;

public class Problem1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        } else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            String str1 = Arrays.toString(ch1);
            String str2 = Arrays.toString(ch2);
            if (!str1.equals(str2)) {
                int count = 0;
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        count++;
                    }
                }
                if (count == 2) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Problem1790 ob = new Problem1790();
        System.out.println(ob.areAlmostEqual("", ""));
    }
}
