import java.util.Scanner;
class Prime_MatrixFilling
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("No. of rows");
        int m=ob.nextInt();
        System.out.println("No. of columns");
        int n=ob.nextInt();
        int prime[][]=new int[m][n];
        int temp=2,i=0,j=0;
        for(i=0;i<m;i++)  //Filling Matrix with prime no.
        {
            for(j=0;j<n;j++)
            {
                if(checkPrime(temp)==1)
                {
                    prime[i][j]=temp;
                }
                else
                {
                    while(checkPrime(temp)!=1)
                    {
                       temp++;
                    }
                    prime[i][j]=temp;
                }
                temp++;
            }
        }
        System.out.println("Matrix filled with first "+m*n+" prime numbers");
        for(i=0;i<m;i++)  //Printing Matrix
        {
            for(j=0;j<n;j++)
            {
                System.out.print(prime[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static int checkPrime(int x) //Method to check Prime no.
    {
        int c=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}