import java.util.Arrays;

public class MovingApples {

    public int moveApples(int input1, int[] input2) {
        if (input1 <= 1)
            return 0;

        if (input1 == 2) {
            return Math.abs(input2[0] - input2[1]);
        }

        Arrays.sort(input2);

        int ans = 0;
        int sum = 0;
        for (int i = 0; i < input1; i++) {
            sum += input2[i];
        }
        int avg = sum / input1;

        for (int i = 0; i < input1 - 1; i++) {

            if (input2[i] > avg) {
                ans += input2[i] - avg;
                input2[i + 1] += input2[i] - avg;
            }

            if (input2[i] < avg) {
                ans += avg - input2[i];
                input2[i + 1] -= avg - input2[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        MovingApples obj = new MovingApples();
        System.out.println(obj.moveApples(5, new int[]{2849, 1620, 705, 1, 30}));
    }
}
