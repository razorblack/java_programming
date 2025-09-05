import java.util.Scanner;

public class Experiment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter data sequence:");
        String str = scanner.nextLine();

        System.out.println("Enter position");
        int pos = scanner.nextInt();

        System.out.println("Enter choice: 1- Stuffing 2- Destuffing");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                stuffing(str, pos);
                break;

            case 2:
                destuffing(str, pos);
                break;

            default:
                System.out.println("Enter valid choice");
                break;
        }
    }

    public static void stuffing(String s, int pos) {
        String result = "";
        String start = "dlestx";
        String end = "dleetx";
        String middle = "dledle";

        s = s.substring(0, pos - 1) + middle + s.substring(pos - 1);
        result = start + s + end;


        // Output
        System.out.println("Frame after stuffing: " + result);

    }

    public static void destuffing(String s, int pos) {
        String result = "";
        int len = s.length();
        s = s.substring(6, len - 6);

        result = s.substring(0, pos - 1) + s.substring(pos + 4);

        // Output
        System.out.println("Frame after destufing: " +result);
    }
}
