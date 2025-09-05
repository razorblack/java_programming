package basic;

import java.util.Scanner;

class CircularPrime {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = ob.nextInt();
        System.out.println("");
        circularCheck(n);
    }

    public static void circularCheck(int n)//Method to check Circular Prime
    {
        int len = Integer.toString(n).length();
        int count = 0, res = 0, rem = 0;
        while (count < len) {
            if (isPrime(n) == 1) {
                res++;
            }
            System.out.println(n);
            rem = n % 10;
            n = n / 10;
            n = rem * (int) Math.pow(10, len - 1) + n;
            count++;
        }
        if (res == len) {
            System.out.println(n + " Is a Circular Prime no");
        } else {
            System.out.println(n + " Is not a Circular Prime no");
        }
    }

    public static int isPrime(int num)//Method to check Prime no.
    {
        int c = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                c++;
            }
        }
        if (c == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}