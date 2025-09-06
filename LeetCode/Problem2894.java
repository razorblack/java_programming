public class Problem2894 {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(10, 3));
    }

    // Time On Space O1
    public static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }

    // Time O1 Space O1
    // Using mathematical formula
    public static int differenceOfSums1(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }
}
