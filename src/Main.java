public class Main {
    public static void main(String[] args) {
        String input = "([]{()})";
        boolean result = IsValidBrackets.isValid(input);
        System.out.println(result ? "Valid" : "Invalid");
    }
}
