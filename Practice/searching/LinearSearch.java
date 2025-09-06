package searching;

public class LinearSearch {

    public static boolean linearSearch(int[] haystack, int needle) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1, 2, 3, 4}, 3));
    }
}
