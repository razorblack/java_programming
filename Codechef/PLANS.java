import java.util.Scanner;

public class PLANS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int loot1 = 0;
        int loot2 = 0;
        byte n = scanner.nextByte();
        short[] arr = new short[n];
        for (byte i = 0; i < n; i++) {
            arr[i] = scanner.nextShort();
        }
        for (byte i = 0; i < n; i++) {
            // Logic
            if(i % 2 == 0) {
                loot1 += arr[i];
            } else {
                loot2 += arr[i];
            }
        }
        // Output
        System.out.println(Math.max(loot1, loot2));
    }
}
