import java.util.Scanner;
class PiggyBank {
    private final String id;
    private double savings;
    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0;
    }
    public void deposit(double amount) {
        savings += amount;
        System.out.println("Savings = " + savings);
    }
    public void withdraw(double amount) {
        if (amount > savings) {
            System.out.println("Rejected, savings stays " + savings);
        } else {
            savings -= amount;
            System.out.println("Savings = " + savings);
        }
    }
    public double getSavings() {
        return savings;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Piggy Bank ID: ");
        String id = sc.next();
        PiggyBank pb = new PiggyBank(id);
        System.out.print("Enter deposit amount: ");
        double depAmt = sc.nextDouble();
        pb.deposit(depAmt);
        System.out.print("Enter withdrawal amount 1: ");
        double withdrawAmt1 = sc.nextDouble();
        pb.withdraw(withdrawAmt1);
        System.out.print("Enter withdrawal amount 2: ");
        double withdrawAmt2 = sc.nextDouble();
        pb.withdraw(withdrawAmt2);
        sc.close();
    }
}
