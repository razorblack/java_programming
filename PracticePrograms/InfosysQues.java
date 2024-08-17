import java.util.Arrays;
import java.util.Scanner;

public class InfosysQues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of players
        int[] playerPowers = new int[n];

        for (int i = 0; i < n; i++) {
            playerPowers[i] = scanner.nextInt(); // Read player powers
        }

        int count = countWinners(playerPowers);
        System.out.println("Number of players who can win in all sequences: " + count);
    }
    public static int countWinners(int[] powers) {
        int n = powers.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Initialize with one player winning for each player
            for (int j = 0; j < i; j++) {
                if (powers[i] > powers[j]) {
                    dp[i] += dp[j]; // Accumulate the possibilities
                }
            }
        }

        int totalPossibilities = 0;
        for (int i = 0; i < n; i++) {
            totalPossibilities += dp[i];
        }

        return totalPossibilities;
    }

}
