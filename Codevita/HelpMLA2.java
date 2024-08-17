import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HelpMLA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int N = scanner.nextInt();
        int[] population = new int[N];
        for (int i = 0; i < N; i++) {
            population[i] = scanner.nextInt();
        }

        // Logic
        Arrays.sort(population);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int j = m1 * population[N -1];
        int k = 0;
        a.add(population[N-1]);
        int length1 = 1; // Length of list a
        int length2 = 0; // Length of list b
        for (int i = N -2; i >= 0; i--) {
            int temp1 = j + m1 * population[i];
            int temp2 = k + m2 * population[i];

            if (temp1 < temp2) {
                a.add(population[i]);
                length1++;
                temp2 = temp2 - m2 * population[i];
            } else {
                temp1 = temp1 - m1 * population[i];
                b.add(population[i]);
                length2++;
            }


            if (temp1 < temp2) {
                j = 0;
                k = temp2 - temp1;
            } else {
                k = 0;
                j = temp1 - temp2;
            }
        }


        // Output

        for (int i = 0; i < length1; i++) {
            if (i < length1 -1) {
                System.out.print(a.get(i) + " ");
            } else {
                System.out.println(a.get(i));
            }

        }
        for (int i = 0; i < length2; i++) {
            if (i < length2 -1) {
                System.out.print(b.get(i) + " ");
            } else {
                System.out.println(b.get(i));
            }
        }
    }
}
