import java.util.ArrayList;
import java.util.Scanner;

public class CW_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int w = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        // Logic: Separation and apply Knapsack Problem Concept
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> weight = new ArrayList<>();
        ArrayList<Integer> cost = new ArrayList<>();

        int indexN = 1;
        int indexWeight = 5;
        int indexCost = 7;
        n.add(Character.getNumericValue(s.charAt(indexN)));
        weight.add(Character.getNumericValue(s.charAt(indexWeight)));
        cost.add(Character.getNumericValue(s.charAt(indexCost)));

        while (indexCost + 8 < s.length()) {
            indexN += 8;
            indexWeight += 8;
            indexCost += 8;

            n.add(Character.getNumericValue(s.charAt(indexN)));
            weight.add(Character.getNumericValue(s.charAt(indexWeight)));
            cost.add(Character.getNumericValue(s.charAt(indexCost)));
        }
        ArrayList<Float> ratio = new ArrayList<>();

        for (int i = 0; i < n.size(); i++) {
            ratio.add((float) (cost.get(i) / weight.get(i)));
        }

        // Sorting each arraylist in descending order with respect to ratio arraylist
        for (int i = 0; i < n.size() - 1; i++) {
            for (int j = 0; j < n.size() - i - 1; i++) {
                if (ratio.get(j) < ratio.get(j + 1)) {
                    float temp = ratio.get(j);
                    ratio.remove(j);
                    ratio.add(j + 1, temp);

                    int temp1 = weight.get(j);
                    weight.remove(j);
                    weight.add(j + 1, temp1);

                    temp = cost.get(j);
                    cost.remove(j);
                    cost.add(j + 1, temp1);

                }
            }
        }

        int totalCost = 0;
        for (int i = 0; i < n.size(); i++) {
            if (w - weight.get(i) >= 0) {
                totalCost += cost.get(i);
                w = w - weight.get(i);
            }
        }
        // Output
        System.out.println(totalCost);
    }
}
