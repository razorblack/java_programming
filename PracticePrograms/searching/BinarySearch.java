package searching;

public class BinarySearch {

    public static boolean binarySearch(int[] haystack, int needle) {
        int start = 0;
        int end = haystack.length - 1;

        do {
            int mid = (start + end) / 2;
            int value = haystack[mid];

            if (value == needle) {
                return true;
            } else if (value > needle) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } while (start <= end);

        return false;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5}, 3));
    }
}
