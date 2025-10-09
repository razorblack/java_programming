public class Problem258 {
    public static void main(String[] args) {
        System.out.println(addDigits1(38));
    }

    /**
     * Time On2
     * Space Input O1
     * Space Auxiliary O1
     * @param num input
     * @return last sum of the digits, till digits became unit
     */
    public static int addDigits(int num) {
        if (num < 10) return num;
        int sum = 0;
        while (num >= 10) {
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return sum;
    }

    /**
     * Time O1
     * Space O1
     * @param num input
     * @return last sum of the digits, till digits became unit
     */
    public static int addDigits1(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}
