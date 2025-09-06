public class Problem1812 {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
    }

    // Time O1 Space O1
    public static boolean squareIsWhite(String coordinates) {
        int bottom = ((int) coordinates.charAt(0)) - 96;
        int top = Integer.parseInt(String.valueOf(coordinates.charAt(1)));
        int sum = bottom + top;

        return sum % 2 == 0 ? false : true;
    }
}
