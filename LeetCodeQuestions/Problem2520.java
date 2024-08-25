public class Problem2520 {
    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }

    public static int countDigits(int num) {
        if (num < 10) {
            return 1;
        }

        int count = 0;
        int originalNumber = num;
        while (num > 0) {
            int temp = num % 10;
            if (originalNumber % temp == 0) {
                count++;
            }
            num = num / 10;
        }

        return count;
    }
}
