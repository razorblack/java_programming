import java.util.Scanner;

class Anagrams {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = ob.nextLine();
        str = str.toUpperCase();
        System.out.println("Anagrams of word '" + str + "' are:");
        int len = str.length();
        char ch[] = new char[len];
        String s = "";
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
        }
        //Loop to print anagrams
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                char temp = ch[j];
                ch[j] = ch[j + 1];
                ch[j + 1] = temp;
                s = "";
                for (int k = 0; k < len; k++) {
                    s = s + ch[k];
                }
                System.out.print(s);
                if (s.equalsIgnoreCase(str)) {
                    System.exit(0);
                } else {
                    System.out.print(",");
                }
            }
        }
    }
}        