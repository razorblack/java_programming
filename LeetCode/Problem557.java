public class Problem557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        for (String word : s.split(" ")) {
            StringBuilder temp = new StringBuilder();
            temp.append(word);
            ans.append(temp.reverse()).append(" ");
        }

        return ans.toString().trim();
    }
}
