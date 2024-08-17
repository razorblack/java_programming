import java.util.Scanner;

public class Object {
    int len;
    String str;
    static int same;
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        obj1.set(obj1,5, "Avinash", 22);
        obj2.set(obj2,7, "Hello", 23);
        System.out.println(obj1.len);
        System.out.println(obj1.str);
        System.out.println(obj2.len);
        System.out.println(obj2.str);
        System.out.println(obj1.same);
        System.out.println(obj2.same);

    }

    public void set(Object ob, int x, String s, int y) {
        ob.len = x;
        ob.str = s;
        same = y;
    }
}
