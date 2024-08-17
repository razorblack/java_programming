import java.util.Scanner;

public class CentauriPrime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();

            for (int t = 1; t <= T; ++t) {
                String kingdom = in.next();
                System.out.println(
                        "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
            }
        }
    }
    private static String getRuler(String kingdom) {
        kingdom = kingdom.toLowerCase();
        String ruler = "";
        char ch = kingdom.charAt(kingdom.length() -1);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            ruler = "Alice";
        } else if (ch == 'y') {
            ruler = "nobody";
        } else {
            ruler = "Bob";
        }
        return ruler;
    }
}
