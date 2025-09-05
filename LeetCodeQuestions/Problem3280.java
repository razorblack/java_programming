public class Problem3280 {
    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29"));
    }

    public static String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        String yearBinary = Integer.toBinaryString(Integer.parseInt(arr[0]));
        String monthBinary = Integer.toBinaryString(Integer.parseInt(arr[1]));
        String dayBinary = Integer.toBinaryString(Integer.parseInt(arr[2]));

        return yearBinary + "-" + monthBinary + "-" + dayBinary;
    }
}
