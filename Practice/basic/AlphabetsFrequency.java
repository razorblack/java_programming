package basic;

import java.util.Scanner;

class AlphabetsFrequency {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = ob.nextLine();
        str = str.toLowerCase();
        System.out.println("===========================");
        System.out.println("Alphabet \t Frequency");
        System.out.println("===========================");
        for (char ch = 'a'; ch <= 'z'; ch++) //Loop to count frequency of characters
        {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(" " + ch + "\t\t\t" + count);
            }
        }
    }
}