package basic;

import java.util.Scanner;

class KeithNumber {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = ob.nextInt();
        int temp = N;//storing copy of entered no.
        String s = Integer.toString(N);
        int d = s.length();//finding no of digits in the number (n)
        int arr[] = new int[N];//array for storing term of series
        int i = 0;
        for (i = d - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp = temp / 10;
        }
        i = d;
        int sum = 0;
        while (sum < N)//finding the sum till it is less than number
        {
            sum = 0;
            //loop for generating and adding the previous 'd' terms
            for (int j = 1; j <= d; j++) {
                sum += arr[i - j];
            }
            arr[i] = sum;
            i++;
        }
        if (sum == N) {
            System.out.println(N + " is a Keith number");
        } else {
            System.out.println(N + " is not a Keith number");
        }
    }
}