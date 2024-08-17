import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter element to search");
        int search = scanner.nextInt();

        // Binary Search
        int low = 0;
        int high = n -1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == search)
                index = mid;

            if (arr[mid] < search)
                low = mid + 1;

            else
                high = mid - 1;
        }

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is at index: " + index);
        }
    }
}
