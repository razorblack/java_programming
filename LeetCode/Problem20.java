import java.util.Stack;

public class Problem20 {
    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));
    }

    /**
     * Time On
     * Space Input On
     * Space Auxiliary On
     * @param s Input
     * @return if string contains valid parenthesis
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                char peek = stack.peek();
                if ((peek == '(' && ch == ')') ||
                        (peek == '[' && ch == ']') ||
                        (peek == '{' && ch == '}')) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty();
    }
}
