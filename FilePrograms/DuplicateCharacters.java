import java.util.Scanner;

class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word ");
        String str = ob.nextLine();
        str = str.toLowerCase();//converting word in lowercase
        String str1 = "";
        for (int i = 0; i < str.length(); i++)//Logic for removing duplicates
        {
            char ch = str.charAt(i);
            if (ch != ' ') {
                str1 = str1 + ch;
            }
            str = str.replace(ch, ' ');
        }
        System.out.println("Word after removing duplicates:" + str1);
    }
}