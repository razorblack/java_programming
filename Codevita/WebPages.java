import java.util.ArrayList;
import java.util.Scanner;

public class WebPages {
    static ArrayList<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        byte N = scanner.nextByte();
        scanner.nextLine();

        int[][] link = new int[N][N];

        for (byte i = 0; i < N; i++) {
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            for (byte j = 0; j < arr.length; j++) {
                int temp = Integer.parseInt(arr[j].trim());
                link[i][temp - 1] = 1;
            }
        }

        byte start = scanner.nextByte();
        byte end = scanner.nextByte();

        // Calling method for link counting
        webPages(start -1, end -1, link, 0, N);

        // Output
        if (result.size() == 0) {
            System.out.println("-1");
        } else {
            int minimum = result.get(0);
            for (int i = 1; i < result.size(); i++) {
                if (result.get(i) < minimum) {
                    minimum = result.get(i);
                }
            }
            System.out.println(minimum);
        }

    }

    public static void webPages(int start, int end, int[][] link, int count, int N) {
        for (int i = 0; i < N; i++) {
            if (link[start][i] == 1) {
                if (i == end) {
                    result.add(count+1);
                }
                link[start][i] = 0;
                webPages(i,end,link,count+1, N);
                link[start][i] = 1;
            }
        }
    }
}
