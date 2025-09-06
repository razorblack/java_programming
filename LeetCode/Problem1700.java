import java.util.ArrayList;
import java.util.List;

public class Problem1700 {
    public static void main(String[] args) {
        System.out.println(countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        int sandwichPicked = 0;

        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            stack.add(students[i]);
        }

        while (!stack.isEmpty() && sandwichPicked < sandwiches.length) {
            // student got his choice of sandwich
            if (stack.get(0) == sandwiches[sandwichPicked]) {
                sandwichPicked++;
                stack.remove(0);
            } else {
                if (!stack.contains(sandwiches[sandwichPicked])) {
                    break;
                }
                // Student didn't get his choice of sandwich
                int studentChoice = stack.get(0);
                stack.remove(0);
                stack.add(studentChoice);
            }



        }

        return stack.size();
    }

}
