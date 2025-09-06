public class Problem1894 {
    public static void main(String[] args) {
        System.out.println(chalkReplacer(new int[]{5,1,5}, 22));
    }

    public static int chalkReplacer(int[] chalk, int k) {
        int ans = -1;

        while (ans == -1) {
            int i = 0;
            for (; i < chalk.length; i++) {
                if (k >= chalk[i]) {
                    k -= chalk[i];
                } else {
                    ans = i;
                    break;
                }
            }

            if (k == 0) {
                ans = i;
            }
        }

        return ans;
    }
}
