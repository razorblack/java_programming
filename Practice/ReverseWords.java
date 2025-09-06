public class ReverseWords {

    public String ReverseCharacters(String input1) {
        // Logic
        input1 = input1.toLowerCase();
        String result = "";
        String[] arr = input1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            StringBuilder str = new StringBuilder(s);
            str.reverse();
            s = str.toString();

            String firstLetter = s.substring(0, 1);
            String remainingLetters = s.substring(1, s.length());
            firstLetter = firstLetter.toUpperCase();
            s = firstLetter + remainingLetters;

            result = result + " " + s;
        }

        return result.trim();
    }


    public static void main(String[] args) {
        ReverseWords obj = new ReverseWords();
        System.out.println(obj.ReverseCharacters("Hello there"));
    }
}
