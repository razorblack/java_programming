import java.util.Scanner;
class IMEI
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter first 14 digits of an IMEI no.");
        String str=ob.nextLine();
        int len=str.length();
        if(len!=14)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int sum=0;
        for(int i=0;i<14;i++)
        {
            char ch=str.charAt(i);
            int temp=(int)ch-48;
            if(i%2!=0)//Doubling every alternate digits
            {
                temp=temp*2;
            }
            sum=sum+digitSum(temp);
        }
        System.out.println("Sum of digits:"+sum);
        int checkDigit=(sum*9)%10; //Finding check digit
        System.out.println("Check Digit:"+checkDigit);
    }
    public static int digitSum(int n)
    {
        int s=0;
        while(n!=0)
        {
            s+=n%10;
            n=n/10;
        }
        return s;
    }
}