import java.util.Stack;

public class IsValid {
    public static boolean valid(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Daha fazla kapatma parantezi var, bu yüzden geçersiz.
                }
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')) {
                    return false; // Eşleşmeyen parantezler, geçersiz.
                }
            }
        }
        return stack.isEmpty(); // Stack boşsa, tüm parantezler eşleşmiştir, aksi halde geçersizdir.
    }

    public static boolean isValid(String input) {
        int openParentheses = 0;
        int openBrackets = 0;
        int openBraces = 0;

        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                openParentheses++;
            } else if (ch == ')') {
                if (openParentheses == 0) {
                    return false; // Geçersiz: Daha fazla kapanma parantezi var.
                }
                openParentheses--;
            } else if (ch == '[') {
                openBrackets++;
            } else if (ch == ']') {
                if (openBrackets == 0) {
                    return false; // Geçersiz: Daha fazla kapanma köşeli parantezi var.
                }
                openBrackets--;
            } else if (ch == '{') {
                openBraces++;
            } else if (ch == '}') {
                if (openBraces == 0) {
                    return false; // Geçersiz: Daha fazla kapanma süslü parantezi var.
                }
                openBraces--;
            }
        }

        // Tüm açma parantezleri kapanmış mı kontrol edelim.
        return openParentheses == 0 && openBrackets == 0 && openBraces == 0;
    }
}
