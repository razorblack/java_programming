package basic;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Decimal Number");
        int n = ob.nextInt();
        String s = Integer.toHexString(n);//Storing Hexadecimal convert of entered no.
        System.out.println("Hexadecimal Convert of " + n + " is:" + s);
    }
}