import java.util.Scanner;
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        double grandTotal = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter payment type (CARD/WALLET/BANKTRANSFER): ");
            String type = sc.next();
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            double adjustedAmount = amount;
            if (type.equalsIgnoreCase("CARD")) {
                adjustedAmount = amount * 1.02;
            } else if (type.equalsIgnoreCase("WALLET")) {
                adjustedAmount = amount * 1.01;
            }
            System.out.printf("%s: %.2f\n", type.toUpperCase(), adjustedAmount);
            grandTotal += adjustedAmount;
        }
        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}
