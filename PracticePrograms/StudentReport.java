import java.util.Arrays;

public class StudentReport {

    public int[] SortStudentMarks(int input1, int input2, int[][] input3) {

        int[] res = new int[input1];
        int[] avg = new int[input2];

        for (int j = 0; j < input2; j++) {
            int sum = 0;
            for (int i = 0; i < input1; i++) {
                sum += input3[i][j];
            }
            avg[j] = sum / input2;
        }

        // Minimum index
        int index = -1;
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < input2; i++) {
            if (avg[i] < value) {
                value = avg[i];
                index = i;
            }
        }

        for (int i = 0; i < input1; i++) {
            int sum = 0;
            for (int j = 0; j < input2; j++) {
                if (j != index) {
                    sum += input3[i][j];
                }
            }
            res[i] = sum;
        }

        return res;
    }

    public static void main(String[] args) {
        StudentReport obj = new StudentReport();
        System.out.println(Arrays.toString(obj.SortStudentMarks(3, 5, new int[][]{{75, 76, 65, 87, 87}, {78, 76, 68, 56, 89}, {67, 87, 78, 77, 65}})));
    }
}
