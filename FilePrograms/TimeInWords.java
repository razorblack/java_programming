import java.util.Scanner;
class TimeInWords
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter time in format e.g. '5,30'");
        System.out.print("Time:");
        String str=ob.nextLine();
        int x=str.indexOf(',');
        int hour=Integer.parseInt(str.substring(0,x));//Storing hour
        int min=Integer.parseInt(str.substring(x+1));//Storing minutes
        if(hour<1||hour>12||min>59||min<0)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if(min<10)
        {
            System.out.print(hour+":0"+min+" ");
        }
        else
        {
            System.out.print(hour+":"+min+" ");
        }
        printTime(hour,min);
    }
    public static void printTime(int h,int m)//Method to print time in words.
    {
        String t2[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
                     "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",
                     "Nineteen","Twenty","Twenty one","Twenty two","Twenty three","Twenty four", 
                     "Twenty five","Twenty six","Twenty seven","Twenty eight","Twenty nine"};
        String time="";
        if(m==0)
        {
            time=t2[h-1]+" o' clock";
        }
        else if(m==15)
        {
            time="Quarter past "+t2[h-1];
        }
        else if(m==30)
        {
            time="Half past "+t2[h-1];
        }
        else if(m==45)
        {
            time="Quarter to "+t2[h];
        }
        else
        {
            if(m>0&&m<30)
            {
                time=t2[m-1]+" minutes past "+t2[h-1];
            }
            else if(m>30&&m<60)
            {
                time=t2[60-m-1]+" minutes to "+t2[h];
            }
        }
        System.out.print(time);
    }
}    