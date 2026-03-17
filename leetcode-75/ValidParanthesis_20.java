import java.util.Stack;

public class ValidParanthesis_20 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Step 1: push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // Step 2: handle closing brackets
            else {
                if (st.isEmpty())
                    return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s="(){}[]";
        System.out.println(isValid(s));
    }
}