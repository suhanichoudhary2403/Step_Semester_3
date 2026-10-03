import java.util.Scanner;
abstract class TravelBooking {
    String mode;
    double distanceKm;
    public TravelBooking(String mode, double distanceKm) {
        this.mode = mode;
        this.distanceKm = distanceKm;
    }
    public abstract double calculateBaseFare();
    public final double calculateTotalFare() {
        return calculateBaseFare() + 50.0;
    }
}
class BusBooking extends TravelBooking {
    public BusBooking(double distanceKm) {
        super("BUS", distanceKm);
    }
    public double calculateBaseFare() {
        return distanceKm * 2.0;
    }
}
class TrainBooking extends TravelBooking {
    public TrainBooking(double distanceKm) {
        super("TRAIN", distanceKm);
    }
    public double calculateBaseFare() {
        return distanceKm * 1.5;
    }
}
class FlightBooking extends TravelBooking {
    public FlightBooking(double distanceKm) {
        super("FLIGHT", distanceKm);
    }
    public double calculateBaseFare() {
        return 2500.0 + (distanceKm * 4.0);
    }
}
public class TravelBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TravelBooking[] bookings = new TravelBooking[n];
        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            double distance = sc.nextDouble();
            if (mode.equalsIgnoreCase("BUS")) {
                bookings[i] = new BusBooking(distance);
            } else if (mode.equalsIgnoreCase("TRAIN")) {
                bookings[i] = new TrainBooking(distance);
            } else if (mode.equalsIgnoreCase("FLIGHT")) {
                bookings[i] = new FlightBooking(distance);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%s: %.2f\n", bookings[i].mode, bookings[i].calculateTotalFare());
        }
        sc.close();
    }
}
