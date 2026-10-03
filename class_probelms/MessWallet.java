import java.util.Scanner;
class MessWallet {
    private double balance;
    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Opening balance cannot be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = openingBalance;
        }
    }
    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: Amount must be greater than 0.");
        } else {
            balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }
    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter opening balance: ");
        double opening = sc.nextDouble();
        MessWallet wallet = new MessWallet(opening);
        System.out.print("Enter top-up amount: ");
        double topUpAmt = sc.nextDouble();
        wallet.topUp(topUpAmt);
        System.out.print("Enter deduction amount: ");
        double deductAmt = sc.nextDouble();
        wallet.deduct(deductAmt);
        System.out.println("Final balance: " + wallet.getBalance());
        sc.close();
    }
}

