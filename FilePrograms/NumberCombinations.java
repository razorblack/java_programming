import java.util.Scanner;
class NumberCombinations
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=ob.nextInt();
        System.out.println("Consecutive number combinations of "+n+" are:");
        int sum=0;
        //Finding no. combinations
        for(int i=1;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=j;
                if(sum==n)
                {
                    for(int k=i;k<=j;k++)
                    {
                        System.out.print(k);
                        if(k!=j)
                        {
                            System.out.print("+");
                        }
                    }
                    System.out.println("");
                }
            }
        }
    }
}