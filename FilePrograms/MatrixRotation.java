import java.util.Scanner;
class MatrixRotation
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter order of square matrix ");
        int M=ob.nextInt();
        if(M<=2||M>=10)
        {
            System.out.println("Invalid Input, Enter order between 2 and 10");
            System.exit(0);
        }
        int A[][]=new int[M][M];
        System.out.println("Enter a matrix of order :"+M);
        for(int i=0;i<M;i++) //Input Matrix
        {
            for(int j=0;j<M;j++)
            {
                A[i][j]=ob.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX"); 
        for(int i=0;i<M;i++) //Printing original matrix
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        rotate(A,M);
    }
    public static void rotate(int A[][],int M) //Method to rotate the matrix by 90`
    {
        System.out.println("MATRIX AFTER ROTATION");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            { 
                if(i<j)
                {
                    int temp=A[j][i];
                    A[j][i]=A[i][j];
                    A[i][j]=temp;
                }
            }
        }
        for(int i=0;i<M;i++)
        {
            for(int j=M-1;j>=0;j--)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        int sum=A[0][0]+A[0][M-1]+A[M-1][0]+A[M-1][M-1];
        System.out.println("Sum of the corner elements = "+sum);
    }
}