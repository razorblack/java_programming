public class Problem3099 {
    public static void main(String[] args) {
        System.out.println(sumOfTheDigitsOfHarshadNumber(23));
    }

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sumOfDigit = 0;
        int originalNumber = x;
        while (x > 0) {
            sumOfDigit += x % 10;
            x /= 10;
        }

        return originalNumber % sumOfDigit == 0 ? sumOfDigit : -1;
    }
}
