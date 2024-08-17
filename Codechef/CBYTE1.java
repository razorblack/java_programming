import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CBYTE1 {
    public static void main(String[] args) {
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input
        byte N = scanner.nextByte(); // Size
        byte[] arr = new byte[N]; // Sequence
        for (byte i = 0; i < N; i++) {
            arr[i] = scanner.nextByte();
        }

        // Logic + Output
        Arrays.sort(arr);
        for (byte i = 1; i < N; i++) {
            if (arr[i] != arr[0]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
