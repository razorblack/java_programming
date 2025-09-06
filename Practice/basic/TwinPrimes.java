package basic;

import java.util.Scanner;

class TwinPrimes {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter minimum value of range");
        int min = ob.nextInt();
        System.out.println("Enter maximum value of range");
        int max = ob.nextInt();
        System.out.println("Twin prime no. within range " + min + " to " + max + " are:");
        for (int i = min; i <= max; i++) //Printing twin prime no.
        {
            if (prime(i) == 1 && prime(i + 2) == 1) {
                System.out.print("(" + i + "," + (i + 2) + ")");
            }
        }
    }

    public static int prime(int x) //Method to check prime no.
    {
        int c = 0;
        if (x <= 1) {
            return 0;
        }
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return 1;
        } else {
            return 0;
        }
    }
}    