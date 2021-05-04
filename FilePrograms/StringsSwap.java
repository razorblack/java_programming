import java.util.Scanner;
class Strings_Swap
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter first string");
        String str1=ob.nextLine();
        System.out.println("Enter second string");
        String str2=ob.nextLine();
        //Swapping strings without using any third variable.
        int len=str2.length();
        str2=str2+str1;
        str1=str2.substring(0,len);
        str2=str2.substring(len);
        System.out.println("Strings after swapping");
        System.out.println("First string:"+str1);
        System.out.println("Second String:"+str2);
    }
}