import java.util.Scanner;

class PackingManufacture {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of boxes for packing");
        int N = ob.nextInt();
        if (N < 1 || N > 1000) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("Break up of " + N + " cartons");
        int carton[] = {48, 24, 12, 6};
        int box[] = {0, 0, 0, 0};
        while (N > 0)//Loop for breaking up of cartons
        {
            if (N >= 48) {
                N = N - 48;
                box[0] = box[0] + 1;
            } else if (N < 48 && N >= 24) {
                N = N - 24;
                box[1] = box[1] + 1;
            } else if (N < 24 && N >= 12) {
                N = N - 12;
                box[2] = box[2] + 1;
            } else if (N < 12 && N >= 6) {
                N = N - 6;
                box[3] = box[3] + 1;
            } else {
                N = 0;
                box[3] = box[3] + 1;
            }
        }
        System.out.println("Box Capacity \t No. of boxes required");
        for (int i = 0; i < 4; i++) {
            if (box[i] != 0) {
                System.out.println(carton[i] + " \t\t " + box[i]);
            }
        }
    }
}