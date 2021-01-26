import java.io.*;
public class Banner
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int N=Integer.parseInt(br.readLine());
        if(N<3||N>8)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        String a[]=new String[N];
        for(int i=1;i<=N;i++)
        {
            System.out.print("Team "+i+":");
            a[i-1]=br.readLine();
        }
        String str=a[0];
        int maxL=str.length();
        for(int i=0;i<N;i++)
        {
            str=a[i];
            int len=str.length();
            if(maxL<len)
            {
                maxL=len;
            }
        }
        char a1[][]=new char[maxL][N];
        for(int i=0;i<maxL;i++)
        {
            for(int j=0;j<N;j++)
            {
                String s=a[j];
                if(i<s.length())
                {
                    System.out.print(s.charAt(i)+"\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println("");
        }
    }
}