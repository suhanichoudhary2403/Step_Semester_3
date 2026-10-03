import java.util.Scanner;
class PayrollAccount {
    private double basicSalary;
    private double bonus;
    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Basic salary cannot be negative. Setting to 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Credit rejected: Bonus amount must be positive.");
        } else {
            this.bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Deduction rejected: Invalid tax percentage value.");
        } else {
            this.basicSalary -= (this.basicSalary * (percent / 100.0));
            System.out.println("Tax deducted: " + (int)percent + "%");
        }
    }
    public double getNetSalary() {
        return this.basicSalary + this.bonus;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double base = sc.nextDouble();
        PayrollAccount account = new PayrollAccount(base);
        System.out.print("Enter bonus amount to credit: ");
        double bonusAmt = sc.nextDouble();
        account.creditBonus(bonusAmt);
        System.out.print("Enter tax percentage to deduct: ");
        double taxPct = sc.nextDouble();
        account.deductTax(taxPct);
        System.out.println("Net salary: Rs " + account.getNetSalary());
        sc.close();
    }
}
