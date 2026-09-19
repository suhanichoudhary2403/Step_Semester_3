import java.util.Scanner;
public class TransactionValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter transaction reference: ");
        String rawInput = scanner.nextLine();
        String reference = rawInput.trim();
        if (reference.length() != 14) {
            System.out.println("Invalid: wrong length");
            scanner.close();
            return;
        }
        for (int i = 0; i < 3; i++) {
            char ch = reference.charAt(i);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                System.out.println("Invalid: bank code must be 3 letters");
                scanner.close();
                return;
            }
        }
        for (int i = 3; i < 14; i++) {
            char ch = reference.charAt(i);
            if (ch < '0' || ch > '9') {
                System.out.println("Invalid: non-digit body");
                scanner.close();
                return;
            }
        }
        String bankCode = reference.substring(0, 3).toUpperCase();
        String day = reference.substring(3, 5);
        String month = reference.substring(5, 7);
        String year = reference.substring(7, 9);
        String sequence = reference.substring(9, 14);
        System.out.println("[" + bankCode + "] DATE: " + day + "/" + month + "/" + year + " | SEQ: " + sequence);
        scanner.close();
    }
}

