public class GoodNeighbours {
    static int goodNeighbours(String a, String b) {
        char ch1 = a.charAt(0);
        char ch2 = a.charAt(a.length() - 1);
        char ch3 = b.charAt(0);
        char ch4 = b.charAt(b.length() - 1);

        if (ch2 != ch3 || ch4 != ch1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(goodNeighbours("01010", "0101010"));
    }
}
