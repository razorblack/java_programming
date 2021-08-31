import java.io.*;

class Calendar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Year:");
        int year = Integer.parseInt(br.readLine());
        System.out.print("Enter Month:");
        String mon = br.readLine();
        System.out.print("Enter 1st day of " + mon + ":");
        String day = br.readLine();
        printCalendar(year, mon, day);  //Calling method printCalendar()
    }

    //Method to print Calendar
    public static void printCalendar(int y, String m, String d) {
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t" + m + " " + y);
        System.out.println("-------------------------------------------------------");
        System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.println("-------------------------------------------------------");
        String months[] = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int Dmon[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //Checking for Leap Year
        if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
            Dmon[1] = 29;
        }
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int temp = 0, temp1 = 0;
        for (int i = 0; i < 7; i++) {
            if (d.equalsIgnoreCase(days[i])) {
                temp = i + 1;
            }
        }
        for (int i = 0; i < 12; i++) {
            if (m.equalsIgnoreCase(months[i])) {
                temp1 = Dmon[i];
            }
        }
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 && j < temp) {
                    System.out.print(" \t");
                } else if (i == 1 && j >= temp && j <= 7) {
                    System.out.print(n + "\t");
                    n++;
                } else {
                    if (n <= temp1) {
                        System.out.print(n + "\t");
                        n++;
                    }
                }
            }
            System.out.println("");
            System.out.println("-------------------------------------------------------");
        }
    }
}

