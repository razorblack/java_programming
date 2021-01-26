import java.util.Scanner;
class Quiz_Competition
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no of participants");
        int N=ob.nextInt();
        if(N<4||N>10)
        {
            System.out.println("Invalid Input,no. out of range");
            System.exit(0);
        }
        char Ans[][]=new char[N][5];//Array to store answers of participants
        System.out.println("\t Enter answer of each participant row-wise in a single line");
        System.out.println("\t\tQ.1 Q.2 Q.3 Q.4 Q.5");
        for(int i=0;i<N;i++)//Loop to enter answers of participants.
        {
            System.out.print("Participant "+(i+1)+" : ");
            for(int j=0;j<5;j++)
            {
                Ans[i][j]=ob.next().charAt(0);
            }
        }
        System.out.println("");
        char AnsKey[]=new char[5];//Array to store answer key
        System.out.print("Key to the questions :");
        for(int i=0;i<5;i++)//Loop to enter answer key.
        {
            AnsKey[i]=ob.next().charAt(0);
        }
        int A[]=new int[N];//Array to store scores of participants
        int temp=0;
        for(int i=0;i<N;i++)//Loop to calculate score of participants.
        {
            for(int j=0;j<5;j++)
            {
                if(Ans[i][j]==AnsKey[j])
                {
                    A[temp]=A[temp]+1;
                }
            }
            temp++;
        }
        System.out.println("");
        System.out.println("-Scores of participants-");
        System.out.println("");
        for(int i=0;i<N;i++)
        {
            System.out.println("Participant:"+(i+1)+"="+A[i]);
        }
        System.out.println("");
        int max=-1,x=0;
        for(int i=0;i<N;i++)//Loop to calculate highest scores & scorer
        {
            if(A[i]>max)
            {
                max=A[i];
                x=i+1;
            }
        }
        System.out.println("Highest scorer : Participant-"+x);
        System.out.println("HIghest score : "+max);
    }
}