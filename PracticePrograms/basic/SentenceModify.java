package basic;

import java.io.*;
import java.util.StringTokenizer;

class SentenceModify {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        String str = br.readLine();
        str = str.toLowerCase();
        int len = str.length();
        char c = str.charAt(len - 1);
        if (!(c == '.' || c == '?')) {
            System.out.println("Entered sentence is not terminated by '.' or '?'");
            System.exit(0);
        }
        str = str.substring(0, len - 1);
        str = str.trim();
        str = ' ' + str;
        len = str.length();
        String s = "";
        for (int i = 0; i < len - 1; i++) {
            if (str.charAt(i) == ' ') {
                c = str.charAt(i + 1);
                int temp = (int) c - 32;
                s += (char) temp;
            } else {
                s += str.charAt(i + 1);
            }
        }
        System.out.println(s);
        s = s.trim();
        s = s + ' ';
        System.out.println("Word \t\t\t\tVowels \t Consonents");
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            display(st.nextToken());
        }
    }

    //Method to display vowels and consonents of word
    public static void display(String str1) {
        System.out.print(str1 + "\t\t");
        str1 = str1.toLowerCase();
        int len = str1.length();
        int vow = 0, cons = 0;
        for (int i = 0; i < len; i++) {
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow++;
            } else {
                cons++;
            }
        }
        if (len < 7) {
            System.out.print("\t \t");
        } else {
            System.out.print("\t");
        }
        System.out.print(vow + "\t\t" + cons);
        System.out.println("");
    }
}