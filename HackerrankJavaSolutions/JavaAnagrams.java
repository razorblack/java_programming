import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        int c = 0; // temporary variable
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] af = new int[26]; // Frequencies of characters of string A
        int[] bf = new int[26]; // Frequencies of characters of string B
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // Initialising each frequencies to be zero
        for (int i = 0; i < 26; i++) {
            af[i] = 0;
            bf[i] = 0;
        }

        // Finding and updating each character frequency in strings
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == ch[i]) {
                    af[i] = af[i] + 1;
                }
            }
            for (int k = 0; k < b.length(); k++) {
                if (ch[i] == b.charAt(k)) {
                    bf[i]++;
                }
            }
        }
        // Checking if both array have same frequencies
        for (int i = 0; i < 26; i++) {
            if (af[i] != bf[i]) {
                c++;
            }
        }

        // Returning result
        return c == 0;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}