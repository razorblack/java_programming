import java.util.Scanner;

public class Objective1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] name = new String[5];
        int[] roll = new int[5];
        String[] gender = new String[5];
        String[] branch = new String[5];
        String[] section = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("For Student " + (i + 1) + ":");
            System.out.println("Enter name");
            name[i] = scanner.nextLine();
            System.out.println("Enter roll number");
            roll[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter gender");
            gender[i] = scanner.nextLine();
            System.out.println("Enter branch");
            branch[i] = scanner.nextLine();
            System.out.println("Enter section");
            section[i] = scanner.nextLine();
        }

        System.out.println("Student Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student 0" + (i + 1) + ":");
            System.out.println("\t Name: " + name[i]);
            System.out.println("\t Roll no.: " + roll[i]);
            System.out.println("\t Gender: " + gender[i]);
            System.out.println("\t Branch: " + branch[i]);
            System.out.println("\t Section: " + section[i]);
        }
    }
}
