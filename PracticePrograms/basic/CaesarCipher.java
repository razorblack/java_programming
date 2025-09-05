package basic;

import java.util.Scanner;

class CaesarCipher {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = ob.nextLine();
        int L = str.length();
        if (L <= 3 || L >= 100) {
            System.out.println("Invalid Input,sentence can't be encrypted");
            System.exit(0);
        }
        String encry = "";
        for (int i = 0; i < L; i++)//Loop to encrypt sentence
        {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) == true) {
                int temp = (int) ch;
                if (temp >= 97 && temp <= 122)//Loop for encryption of small letters
                {
                    if (temp + 13 <= 122) {
                        encry += (char) (temp + 13);
                    } else {
                        encry += (char) (temp - 13);
                    }
                }
                if (temp >= 65 && temp <= 90)//Loop for encryption of capital letters
                {
                    if (temp + 13 <= 90) {
                        encry += (char) (temp + 13);
                    } else {
                        encry += (char) (temp - 13);
                    }
                }
            } else {
                encry += ch;
            }
        }
        System.out.println("The Cipher Text is:" + encry);
    }
}    