public class SortWords {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";

        String[] arr = str.split(" ");
        int[] num = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            num[i] = (int) arr[i].charAt(arr[i].length() - 1);
        }

//        Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                    // arr comparison
                    String t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res = res + arr[i].substring(0, arr[i].length() - 1) + " ";
        }

        System.out.println(res);
    }
}
