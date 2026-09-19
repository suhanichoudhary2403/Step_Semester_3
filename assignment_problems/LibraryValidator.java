import java.util.Scanner;
public class LibraryValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter raw code: ");
        String code = scanner.nextLine();
        code = code.trim();
        if (code.length() != 13) {
            System.out.println("Invalid: wrong length");
        } else {
            boolean isValid = true;
            String upperCode = "";
            for (int i = 0; i < 3; i++) {
                char ch = code.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32); 
                }
                if (ch < 'A' || ch > 'Z') {
                    System.out.println("Invalid: non-letter publisher code");
                    isValid = false;
                    break;
                }
                upperCode += ch;
            }
            if (isValid == true) {
                for (int i = 3; i < 13; i++) {
                    char ch = code.charAt(i);
                    if (ch < '0' || ch > '9') {
                        System.out.println("Invalid: non-digit body");
                        isValid = false;
                        break;
                    }
                    upperCode += ch;
                }
            }
            if (isValid == true) {
                System.out.print("[");
                for (int i = 0; i < 3; i++) {
                    System.out.print(upperCode.charAt(i));
                }
                System.out.print("] YEAR: ");
                for (int i = 3; i < 7; i++) {
                    System.out.print(upperCode.charAt(i));
                }
                System.out.print(" | CATALOG: ");
                for (int i = 7; i < 13; i++) {
                    System.out.print(upperCode.charAt(i));
                }
                System.out.println(); 
            }
        }
        scanner.close();
    }
}
