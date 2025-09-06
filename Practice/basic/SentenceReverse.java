package basic;

import java.io.*;
import java.util.StringTokenizer;

class SentenceReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of sentences:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter the sentence:");
        String str = br.readLine();
        str = str.trim();
        String str1 = "";
        for (int i = 0; i < str.length(); i++)//Loop to remove characters other than letters & whitespace
        {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) || Character.isWhitespace(ch)) {
                str1 = str1 + ch;
            }
        }
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                count++;
            }
        }
        String tok[] = new String[count + 1];// Array to store tokens of sentence
        str1 = str1.trim();
        str1 = str1 + ' ';
        int x = 0;
        StringTokenizer st = new StringTokenizer(str1);
        while (st.hasMoreTokens())//Loop to store tokens in array
        {
            tok[x] = st.nextToken();
            x++;
        }
        System.out.println("Sentences after reversing without punctuation");
        for (int i = tok.length - 1; i >= 0; i--) {
            System.out.print(tok[i] + " ");
        }
    }
}