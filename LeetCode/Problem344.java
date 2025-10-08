import java.util.Arrays;

public class Problem344 {
    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    /**
     * Approach In-place reversing using two-pointers
     * Time On
     * Space Input On
     * Space Auxiliary O3
     * @param s input array
     * Another approach: Can be done using the copy array with Space Auxiliary On
     */
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start <= end) {
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
    }
}
