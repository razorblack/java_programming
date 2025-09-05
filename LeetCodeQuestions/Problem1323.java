public class Problem1323 {
    public static void main(String[] args) {
        System.out.println("str".substring(0, 0));
//        System.out.println(maximum69Number(9669));
    }

    public static int maximum69Number (int num) {
        if (num == 9999) {
            return num;
        }

        if (num / 10 == 6) {

        }


        String str = String.valueOf(num);
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '6') {
                index = i;
                break;
            }
        }

        if (index != -1) {
            return num;
        } else {
            return num;
        }
    }
}
