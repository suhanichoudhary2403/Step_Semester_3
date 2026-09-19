import java.util.Scanner;
public class PhoneNumberMasker {
    public static String maskPhoneNumber(String phone) {
        if (phone == null || phone.length() != 10) {
            return "Invalid phone number";
        }
        for (int i = 0; i < phone.length(); i++) {
            if (phone.charAt(i) < '0' || phone.charAt(i) > '9') {
                return "Invalid phone number";
            }
        }
        StringBuilder masked = new StringBuilder();
        masked.append("XXXXXX-");
        masked.append(phone.substring(6));
        return masked.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        String result = maskPhoneNumber(phone);
        System.out.println(result);
        scanner.close();
    }
}
