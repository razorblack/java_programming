import java.util.Scanner;

class BouncyNumber {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a no. to check for Bouncy");
        int n = ob.nextInt();
        int l = increaseDecrease(n);
        if (l == 0) {
            System.out.println(n + " is a Bouncy Number");
        } else {
            System.out.println(n + " is not a Bouncy Number");
        }
    }

    public static int increaseDecrease(int x)//Method to check Increasing/Decreasing no.
    {
        int c = 0, c1 = 0;
        String str = Integer.toString(x);
        int len = str.length();
        for (int i = 0; i < len - 1; i++) {
            char ch = str.charAt(i);
            char ch1 = str.charAt(i + 1);
            if (ch < ch1) {
                c++;
            }
            if (ch > ch1) {
                c1++;
            }
        }
        if (c == (len - 1) && c1 == (len - 1)) {
            return 1;
        } else {
            return 0;
        }
    }
}