package validParentheses;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "({[})]";
        int open = 0,close = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') open++;
            if (c == '{') open++;
            if (c == '[') open++;
            if (c == ')') close++;
            if (c == '}') close++;
            if (c == ']') close++;

        }

    if (open == close) System.out.println("YES " + open + " " + close);
    else System.out.println("NO " + open + " " + close);

    }
}
