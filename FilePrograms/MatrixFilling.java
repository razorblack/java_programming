import java.util.Scanner;
class Matrix_Filling
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("ENTER SIZE OF MATRIX:");
        int n=ob.nextInt();
        if(n<3||n>10)
        {
            System.out.println("Invalid Input,Size out of range");
            System.exit(0);
        }
        int M[][]=new int[n][n];
        System.out.println("Enter first character :");
        char ch1=ob.next().charAt(0);
        System.out.println("Enter second character :");
        char ch2=ob.next().charAt(0);
        System.out.println("Enter third character :");
        char ch3=ob.next().charAt(0);
        for(int i=0;i<n;i++) //Logic for Matrix Filling
        {
            for(int j=0;j<n;j++)
            {
                if(i==j||i+j==n-1)
                {
                    M[i][j]=ch3;
                }
                else
                {
                    M[i][j]=ch2;
                }
            }
        }
        for(int i=0;i<n/2;i++)
        {
            for(int j=i+1;j<n-1-i;j++)
            {
                M[i][j]=ch1;
                M[n-1-i][j]=ch1;
            }
        }
        System.out.println("Matrix after filling");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print((char)M[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
   