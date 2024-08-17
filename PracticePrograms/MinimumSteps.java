import java.util.Scanner;

public class MinimumSteps {
    static boolean sol(int a, int b, int x, int y) {
        if(a == x && b == y)
            return true;
        else if(a > x || b > y)
            return false;
        else if(sol(a+b, b, x, y) || sol(a, a+b, x, y)) // fix applied here
            return true;
        return false;
    }
    static String ans(int x, int y) {
        if(sol(1, 1, x, y)) return "Yes";
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(ans(x, y));
    }
}
