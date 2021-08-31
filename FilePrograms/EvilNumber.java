import java.util.Scanner;

class EvilNumber {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("INPUT\t:");
        int n = ob.nextInt();
        String binary = Integer.toBinaryString(n); //Storing binary equivalent of entered no.
        System.out.println("BINARY EQUIVALENT :" + binary);
        int len = binary.length();
        int c = 0;
        for (int i = 0; i < len; i++) {
            if (binary.charAt(i) == '1') {
                c++;
            }
        }
        System.out.println("NO. OF 1's :" + c);
        if (c % 2 == 0) {
            System.out.println("OUTPUT :EVIL NUMBER");
        } else {
            System.out.println("OUTPUT :NOT AN EVIL NUMBER");
        }
    }
}