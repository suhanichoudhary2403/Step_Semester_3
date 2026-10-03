import java.util.Scanner;
abstract class Connection {
    String type;
    int units;
    public Connection(String type, int units) {
        this.type = type;
        this.units = units;
    }
    public abstract double calculateBill();
}
class HomeConnection extends Connection {
    public HomeConnection(int units) {
        super("HOME", units);
    }
    public double calculateBill() {
        if (units <= 100) {
            return units * 5.0;
        }
        return (100 * 5.0) + ((units - 100) * 7.0);
    }
}
class ShopConnection extends Connection {
    public ShopConnection(int units) {
        super("SHOP", units);
    }
    public double calculateBill() {
        return (units * 8.0) + 100.0;
    }
}
class FactoryConnection extends Connection {
    public FactoryConnection(int units) {
        super("FACTORY", units);
    }
    public double calculateBill() {
        double bill = units * 6.0;
        if (bill < 1000.0) {
            return 1000.0;
        }
        return bill;
    }
}
public class ElectricityBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Connection[] connections = new Connection[n];
        double totalBilled = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();
            if (type.equalsIgnoreCase("HOME")) {
                connections[i] = new HomeConnection(units);
            } else if (type.equalsIgnoreCase("SHOP")) {
                connections[i] = new ShopConnection(units);
            } else if (type.equalsIgnoreCase("FACTORY")) {
                connections[i] = new FactoryConnection(units);
            }
        }
        for (int i = 0; i < n; i++) {
            double bill = connections[i].calculateBill();
            System.out.printf("%s: %.2f\n", connections[i].type, bill);
            totalBilled += bill;
        }
        System.out.printf("Total: %.2f\n", totalBilled);
        sc.close();
    }
}
