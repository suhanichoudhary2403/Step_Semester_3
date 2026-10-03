import java.util.Scanner;
interface Insurable {
    double calculateInsurance(double value);
}
abstract class Parcel {
    String type;
    double weight;
    double value;
    public Parcel(String type, double weight, double value) {
        this.type = type;
        this.weight = weight;
        this.value = value;
    }
    public abstract double calculateCharge();
}
class StandardParcel extends Parcel {
    public StandardParcel(double weight, double value) {
        super("STANDARD", weight, value);
    }
    public double calculateCharge() {
        return 40.0 + (10.0 * weight);
    }
}
class ExpressParcel extends Parcel implements Insurable {
    public ExpressParcel(double weight, double value) {
        super("EXPRESS", weight, value);
    }
    public double calculateCharge() {
        return 80.0 + (15.0 * weight);
    }
    public double calculateInsurance(double value) {
        return value * 0.02;
    }
}
class FragileParcel extends StandardParcel implements Insurable {
    public FragileParcel(double weight, double value) {
        super(weight, value);
        this.type = "FRAGILE";
    }
    public double calculateCharge() {
        return super.calculateCharge() + 50.0;
    }
    public double calculateInsurance(double value) {
        return value * 0.02;
    }
}
public class ParcelShippingDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Parcel[] parcels = new Parcel[n];
        double grandTotal = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double weight = sc.nextDouble();
            double value = sc.nextDouble();
            if (type.equalsIgnoreCase("STANDARD")) {
                parcels[i] = new StandardParcel(weight, value);
            } else if (type.equalsIgnoreCase("EXPRESS")) {
                parcels[i] = new ExpressParcel(weight, value);
            } else if (type.equalsIgnoreCase("FRAGILE")) {
                parcels[i] = new FragileParcel(weight, value);
            }
        }
        for (int i = 0; i < n; i++) {
            double charge = parcels[i].calculateCharge();
            double insurance = 0;
            if (parcels[i] instanceof Insurable) {
                insurance = ((Insurable) parcels[i]).calculateInsurance(parcels[i].value);
            }
            double total = charge + insurance;
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f\n", parcels[i].type, charge, insurance, total);
            grandTotal += total;
        }
        System.out.printf("Grand Total: %.2f\n", grandTotal);
        sc.close();
    }
}
