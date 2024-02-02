import java.util.Stack;

public class IsValidBrackets {

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            System.out.println("\nCharacter: " + ch);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                System.out.println("Added to Stack. Stack Status: " + stack);

            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Invalid!: There are more closing brackets.");
                    return false;
                }
                char top = stack.pop();
                System.out.println("Character matched: " + top + " and " + ch);

                if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')) {
                    System.out.println("Invalid!: Non-matching parentheses.");
                    return false;
                }
                System.out.println("Removed from the stack. Stack Status: " + stack);
            }

        }

        if (!stack.isEmpty()) {
            System.out.println("Invalid: Open parentheses.");
        } else {
            System.out.println("Valid: All brackets are closed compliant.");
        }


        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "([]{()})";
        boolean result = isValid(input);
        System.out.println(result ? "Valid" : "Invalid");
    }
}
