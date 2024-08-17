import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a binary string");
        String str1 = scanner.nextLine();
        System.out.println("Enter second binary string");
        String str2 = scanner.nextLine();

        if (str1.length() == str2.length()) {
            int count = 0;

            // Using comparison method
//            for (int i = 0; i < str1.length(); i++) {
//                char ch1 = str1.charAt(i);
//                char ch2 = str2.charAt(i);
//                if (ch1 != ch2) {
//                    count++;
//                }
//            }

            // Using XOR method
            for (int i = 0; i < str1.length(); i++) {
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                int first = Character.getNumericValue(ch1);
                int second = Character.getNumericValue(ch2);

                if ((first ^ second) == 1) {
                    count++;
                }

            }
            System.out.println("Hamming Distance=" + count);

        } else {
            System.out.println("Enter string of same length");
        }
    }
}
