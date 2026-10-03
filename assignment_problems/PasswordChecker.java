import java.util.Scanner;
class PasswordChecker {
    private final String password;
    public PasswordChecker(String password) {
        this.password = password;
    }
    public String getStrength() {
        int len = password.length();
        if (len < 6) {
            return "Weak";
        } else if (len <= 9) {
            return "Medium";
        }
        return "Strong";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password to check: ");
        String pass1 = sc.next();
        PasswordChecker pc1 = new PasswordChecker(pass1);
        System.out.println("Strength: " + pc1.getStrength());
        System.out.print("Enter another password to check: ");
        String pass2 = sc.next();
        PasswordChecker pc2 = new PasswordChecker(pass2);
        System.out.println("Strength: " + pc2.getStrength());
        sc.close();
    }
}
