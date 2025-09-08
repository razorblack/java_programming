package recursion;

public class PrintName {
    public static void main(String[] args) {
        printName("Avinash", 5);
    }

    /**
     * Time On (N recursive call with constant operation)
     * Space On (N stack of recursion waiting to get completed)
     * @param name
     * @param count
     */
    private static void printName(String name, int count) {
        if (count == 0) return;

        else {
            System.out.println(name);
            printName(name, count - 1);
        }
    }
}
