import java.util.ArrayList;
import java.util.List;

public class Problem118 {
    public static void main(String[] args) {
        System.out.println(generate(4));
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> row = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            int temp = (int) Math.pow(11, i);
            List<Integer> cell = new ArrayList<>();
            while (temp > 0) {
                cell.add(temp % 10);
                temp /= 10;
            }
            row.add(cell);
        }
        return row;
    }
}
