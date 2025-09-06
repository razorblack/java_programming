//Program to find shortest and longest word of a entered string

import java.util.*;

class StringModify {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = ob.nextLine();
        int c = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                c++;
            }
        }
        String a[] = new String[c];
        int x = 0;
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            a[x] = st.nextToken();
            x++;
        }
        for (int i = 0; i < c - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                String s1 = a[j];
                String s2 = a[j + 1];
                if (s1.length() > s2.length()) {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Shortest word:" + a[0]);
        System.out.println("Longest word:" + a[c - 1]);
    }
}
        