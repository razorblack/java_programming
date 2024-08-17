import java.util.ArrayList;
import java.util.List;

public class EqualTime {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(4);
        list1.add(1);
        System.out.println(updateTimes(list1, list2));
    }

    public static int updateTimes(List<Integer> signalOne, List<Integer> signalTwo) {
        int n = signalOne.size();
        int m = signalTwo.size();

        int min = Math.min(n, m);
        return n;
    }
}
