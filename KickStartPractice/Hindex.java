import java.util.Scanner;

public class Hindex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get number of test cases in input
        short testCaseCount = scanner.nextShort();
        // Iterate through test cases
        for (short tc = 1; tc <= testCaseCount; ++tc) {
            // Get number of papers for this test case
            int paperCount = scanner.nextInt();
            // Get number of citations for each paper
            int[] citations = new int[paperCount];
            for (int p = 0; p < paperCount; ++p) {
                citations[p] = scanner.nextInt();
            }
            // Print h-index score after each paper in this test case
            System.out.print("Case #" + tc + ":");
            for (int score : getHIndexScore(citations)) {
                System.out.append(" ").print(score);
            }
            System.out.println();
        }
    }

    public static int[] getHIndexScore(int[] citationsPerPaper) {
        int[] hIndex = new int[citationsPerPaper.length];

        int hIndexValue = 0;
        for (int i = 1; i <= citationsPerPaper.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (citationsPerPaper[j] >= i) {
                    count++;
                }
            }

            if (count >= i) {
                hIndexValue++;
            }

            hIndex[i] = hIndexValue;
        }

        return hIndex;
    }
}
