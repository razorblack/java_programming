import java.text.*;
import java.util.*;

class DateDifference {
    public static void main(String[] args) throws Exception {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter dates in format 'dd/mm/yyyy'");
        System.out.print("Date 1:");
        String sdate1 = ob.nextLine();
        System.out.print("Date 2:");
        String sdate2 = ob.nextLine();
        if (isValidDate(sdate1) == false && isValidDate(sdate2) == false) {
            System.out.println("Invalid Input,Enter Valid Dates");
            System.exit(0);
        }
        //Converting String Dates into java Date format
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sdate1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sdate2);
        long diff = daysBetween(date1, date2);
        System.out.println("Difference=" + diff + " days");
    }

    public static long daysBetween(Date one, Date two)//Method to find date difference
    {
        //Converting dates into millisecond and divide it by millisecond in a day
        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
    }

    public static boolean isValidDate(String d)//Method to check Validity of dates
    {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            df.parse(d);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}