import java.util.Scanner;
class Paragraph_Arrange
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a paragraph");
        String str=ob.nextLine();
        int len=str.length();
        int y=0,x=0,temp=0;
        for(int i=0;i<len;i++)//Loop to count no. of sentence.
        {
            char ch=str.charAt(i);
            if(ch=='.'||ch=='!'||ch=='?')
            {
                x++;
            }
        }
        if(x>10)
        {
            System.out.println("Sentence out of range");
            System.exit(0);
        }
        String s[]=new String[x];//Array to store sentences
        int nWord[]=new int[x];
        //Loop to find no of words in a sentence
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='.'||ch=='?'||ch=='!')
            {
                s[y]=str.substring(temp,i);
                nWord[y]=wordCount(s[y].trim());
                temp=i+1;
                y++;
            }
        }
        String temp1="";
        temp=0;
        //Loop to arrange sentences in ascending order of their no. of words
        for(int i=0;i<x-1;i++)
        {
            for(int j=0;j<x-1;j++)
            {
                if(nWord[j]>nWord[j+1])
                {
                    temp=nWord[j];
                    nWord[j]=nWord[j+1];
                    nWord[j+1]=temp;
                    temp1=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp1;
                }
            }
        }
        for(int i=0;i<x;i++)
        {
            System.out.println(s[i]+"="+nWord[i]);
        }
    }
    //Method to count no of words in a sentence
    public static int wordCount(String st)
    {
        int count=0;
        int l=st.length();
        for(int i=0;i<l;i++)
        {
            if(st.charAt(i)==' ')
            {
                count++;
            }
        }
        return count+1;
    }
}