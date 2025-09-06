public class Problem1945 {
    public static void main(String[] args) {
        System.out.println(getLucky1("leetcode", 2));
    }

    public static int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int temp = ((int) s.charAt(i)) - 96;
            str.append(temp);
        }

        for (int i = 0; i < k; i++) {
            str = sumOfDigits(str);
        }

        return Integer.parseInt(str.toString());
    }

    private static StringBuilder sumOfDigits(StringBuilder number) {
        int sum = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(number.substring(i, i+1));
        }
        ans.append(sum);
        return ans;
    }


    // Time On2 Space O1
    public static int getLucky1(String s, int k) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += digitSum((int) s.charAt(i) - 96);
        }

        for (int i = 1; i < k; i++) {
            sum = digitSum(sum);
        }

        return sum;
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
