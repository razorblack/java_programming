import java.util.Arrays;
import java.util.Scanner;

public class CW_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String str = scanner.nextLine();
        int K = scanner.nextInt();
        int num = scanner.nextInt();

        // Logic
        String[] splitArray = str.split(" ");
        int[] arr = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            arr[i] = Integer.parseInt(splitArray[i]);
        }
        Arrays.sort(arr);

        if (arr[K - 1] >= num) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
