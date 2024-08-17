import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JECTRIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testcase
        byte T = scanner.nextByte();
        scanner.nextLine();

        for (byte i = 0; i < T; i++) {
            String s = scanner.nextLine();
            int len = s.length();
            // Logic
            Set<Character> ch = Stream.of('a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i',
                    'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                    'w', 'x', 'y', 'z').collect(Collectors.toSet());


            for (byte j = 0; j < len; j++) {
                ch.remove(s.charAt(j));
            }
            // Output
            if (ch.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(ch.stream().findFirst().get());
            }
        }
    }
}
