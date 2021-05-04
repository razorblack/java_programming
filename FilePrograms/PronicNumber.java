import java.util.Scanner;
class PronicNumber
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no. to check for PRONIC");
        int n=ob.nextInt();
        checkPronic(n);
    }
    public static void checkPronic(int n)//Method to check for Pronic no.
    {
        int c=0,i=0;
        while(i*(i+1)<=n&&c==0)
        {
            if(i*(i+1)==n)
            {
                c=1;
            }
            i++;
        }
        if(c==1)
        {
            System.out.println(n+" is a PRONIC NUMBER");
        }
        else
        {
            System.out.println(n+"is not a PRONIC NUMBER");
        }
    }
}