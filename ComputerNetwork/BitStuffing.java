import java.util.Scanner;

public class BitStuffing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter binary value:");
        String str = scanner.nextLine();

        System.out.println("Enter choice: 1- Stuffing 2- Destuffing");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                stuffing(str);
                break;

            case 2:
                destuffing(str);
                break;

            default:
                System.out.println("Enter valid choice");
        }
    }

    public static void stuffing(String s) {
        String result = "";
        int countOne = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                countOne++;
            }

            if (ch == '0') {
                countOne = 0;
            }

            if (countOne == 5) {
                result += ch;
                result += '0';
            } else {
                result += ch;
            }

        }

        // Output
        System.out.println(result);

    }

    public static void destuffing(String s) {
        String result = "";
        int countOne = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                countOne++;
            }

            if (ch == '0') {
                countOne = 0;
            }

            if (countOne == 5) {
                result += ch;
                i++;
            } else {
                result += ch;
            }

        }

        // Output
        System.out.println(result);
    }
}
