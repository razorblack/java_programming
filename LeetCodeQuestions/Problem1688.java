public class Problem1688 {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }

    // Time On Space O1
    public static int numberOfMatches(int n) {
        int ans = 0;

        while (n > 1) {
            if (n % 2 == 0){
                int temp = n / 2;
                ans += temp;
                n = temp;
            } else {
                int temp = (n - 1) / 2;
                ans += temp;
                n = temp + 1;
            }
        }

        return ans;
    }
}
