import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem2798 {
    public static void main(String[] args) {
        System.out.println(numberOfEmployeesWhoMetTarget1(new int[]{0,1,2,3,4}, 2));
    }

    // Time On Space O1
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }
        return count;
    }

    // Time On Space O1
    public static int numberOfEmployeesWhoMetTarget1(int[] hours, int target) {
        AtomicInteger count = new AtomicInteger();
        Arrays.stream(hours)
                .forEach(x -> {
                    if (x >= target) {
                        count.getAndIncrement();
                    }
                });

        return count.get();
    }
}
