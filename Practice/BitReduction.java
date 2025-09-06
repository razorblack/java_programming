public class BitReduction {
    static long bitReduction(int []a) {

        for (int i = 0; i < a.length; i++) {
            int n = a[i];

            // Logic for removing msb
            if ((n & n>>1) != 0) {
                n = n & n>>1;
            } else {
                n = n>>1;
            }


            a[i] = n;
        }

        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(bitReduction(new int[]{2, 4, 6, 8, 1, 5, 7}));
    }
}
