import java.util.Scanner;
interface SaverMode {
    double applySaver(double units);
}
abstract class Appliance {
    String type;
    int hours;
    public Appliance(String type, int hours) {
        this.type = type;
        this.hours = hours;
    }
    public abstract double getPower();
    public final double calculateUnits() {
        return (getPower() * hours) / 1000.0;
    }
}
class Fridge extends Appliance {
    public Fridge(int hours) {
        super("FRIDGE", hours);
    }
    public double getPower() {
        return 150.0;
    }
}
class TV extends Appliance {
    public TV(int hours) {
        super("TV", hours);
    }
    public double getPower() {
        return 100.0;
    }
}
class AC extends Appliance implements SaverMode {
    public AC(int hours) {
        super("AC", hours);
    }
    public double getPower() {
        return 1500.0;
    }
    public double applySaver(double units) {
        return units * 0.75;
    }
}
class Washer extends Appliance implements SaverMode {
    public Washer(int hours) {
        super("WASHER", hours);
    }
    public double getPower() {
        return 500.0;
    }
    public double applySaver(double units) {
        return units * 0.75;
    }
}
public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double totalCost = 0;
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String type = parts[0];
            int hours = Integer.parseInt(parts[1]);
            boolean isSaver = (parts.length > 2 && parts[2].equalsIgnoreCase("SAVER"));
            Appliance app = null;
            if (type.equalsIgnoreCase("FRIDGE")) {
                app = new Fridge(hours);
            } else if (type.equalsIgnoreCase("AC")) {
                app = new AC(hours);
            } else if (type.equalsIgnoreCase("TV")) {
                app = new TV(hours);
            } else if (type.equalsIgnoreCase("WASHER")) {
                app = new Washer(hours);
            }
            if (isSaver && !(app instanceof SaverMode)) {
                System.out.println(type.toUpperCase() + ": saver mode not supported");
                continue;
            }
            double units = app.calculateUnits();
            if (isSaver) {
                units = ((SaverMode) app).applySaver(units);
            }
            double cost = units * 8.0;
            System.out.printf("%s: Units=%.2f Cost=%.2f\n", app.type, units, cost);
            totalCost += cost;
        }
        System.out.printf("Total Cost: %.2f\n", totalCost);
        sc.close();
    }
}
