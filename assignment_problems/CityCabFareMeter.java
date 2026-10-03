import java.util.Scanner;
interface NightService {
    double applyNightSurcharge(double fare);
}
abstract class Cab {
    String type;
    double km;
    public Cab(String type, double km) {
        this.type = type;
        this.km = km;
    }
    public abstract double getRatePerKm();
    public final double calculateBaseFare() {
        double fare = km * getRatePerKm();
        return fare < 100.0 ? 100.0 : fare;
    }
}
class MiniCab extends Cab {
    public MiniCab(double km) {
        super("MINI", km);
    }
    public double getRatePerKm() {
        return 10;
    }
}
class SedanCab extends Cab implements NightService {
    public SedanCab(double km) {
        super("SEDAN", km);
    }
    public double getRatePerKm() {
        return 14;
    }
    public double applyNightSurcharge(double fare) {
        return fare * 1.20;
    }
}
class SuvCab extends Cab implements NightService {
    public SuvCab(double km) {
        super("SUV", km);
    }
    public double getRatePerKm() {
        return 18;
    }
    public double applyNightSurcharge(double fare) {
        return fare * 1.20;
    }
}
public class CityCabFareMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalCollected = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();
            Cab cab = null;
            if (type.equalsIgnoreCase("MINI")) {
                cab = new MiniCab(km);
            } else if (type.equalsIgnoreCase("SEDAN")) {
                cab = new SedanCab(km);
            } else if (type.equalsIgnoreCase("SUV")) {
                cab = new SuvCab(km);
            }
            if (time.equalsIgnoreCase("NIGHT") && !(cab instanceof NightService)) {
                System.out.println(type.toUpperCase() + ": night service not available");
                continue;
            }
            double finalFare = cab.calculateBaseFare();
            if (time.equalsIgnoreCase("NIGHT")) {
                finalFare = ((NightService) cab).applyNightSurcharge(finalFare);
            }
            System.out.printf("%s: %.2f\n", cab.type, finalFare);
            totalCollected += finalFare;
        }
        System.out.printf("Total: %.2f\n", totalCollected);
        sc.close();
    }
}
