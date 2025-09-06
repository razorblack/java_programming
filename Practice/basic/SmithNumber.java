package basic;

import java.util.Scanner;

class SmithNumber {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = ob.nextInt();
        if (prime(n) == 1) {
            System.out.println(n + " is not a Smith_Number");
        } else {
            smithCheck(n);
        }
    }

    public static int prime(int x)//Method to check Prime no.
    {
        if (x == 1) {
            return 0;
        }
        int c = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                c++;
            }
        }
        if (c == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int digitSum(int x)//Method to find sum of digits
    {
        int sum = 0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;
            sum += rem;
        }
        return sum;
    }

    public static void smithCheck(int n)//Method to check no. is a Smith no. or not
    {
        int s1 = digitSum(n);//Storing sum of entered no.
        int s2 = 0;
        for (int i = 2; i <= n; i++)//loop to find prime factors of no.
        {
            if (prime(i) == 1) {
                while (n % i == 0) {
                    s2 += digitSum(i);
                    n = n / i;
                }
            }
        }
        if (s1 == s2) {
            System.out.println("Entered no is a Smith no");
        } else {
            System.out.println("Entered no is not a Smith no");
        }
    }
}