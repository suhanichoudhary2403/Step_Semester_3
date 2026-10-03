import java.util.Scanner;
public class CanteenBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            double finalAmount = amount;
            if (type.equalsIgnoreCase("STUDENT")) {
                finalAmount = amount * 0.90;
            } else if (type.equalsIgnoreCase("STAFF")) {
                finalAmount = amount * 0.95;
            } else if (type.equalsIgnoreCase("GUEST")) {
                finalAmount = amount + 10;
            }
            System.out.printf("%s: %.2f\n", type.toUpperCase(), finalAmount);
            total += finalAmount;
        }
        System.out.printf("Total: %.2f\n", total);
        sc.close();
    }
}
