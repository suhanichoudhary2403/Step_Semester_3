import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = scanner.next();
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        if (text.equalsIgnoreCase(reversed)) {
            System.out.println(text + " is a Palindrome!");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
        scanner.close();
    }
}
