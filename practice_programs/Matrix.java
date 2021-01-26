//Program to 4x4 matrix without its diagonals
import java.util.Scanner;
class Matrix
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int a[][]=new int[4][4];
        System.out.println("Enter a matrix of order 4x4");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }
        System.out.println("Modified Matrix");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if((i==j)||(i+j==3))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }
}