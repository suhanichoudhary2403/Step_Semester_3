import java.util.Scanner;
abstract class Ticket {
    String type;
    int count;
    public Ticket(String type, int count) {
        this.type = type;
        this.count = count;
    }
    public abstract double getBasePrice();
    public final double calculateTotal() {
        return (getBasePrice() + 20.0) * count;
    }
}
class RegularTicket extends Ticket {
    public RegularTicket(int count) {
        super("REGULAR", count);
    }
    public double getBasePrice() {
        return 150.0;
    }
}
class PremiumTicket extends Ticket {
    public PremiumTicket(int count) {
        super("PREMIUM", count);
    }
    public double getBasePrice() {
        return 250.0;
    }
}
class ReclinerTicket extends Ticket {
    public ReclinerTicket(int count) {
        super("RECLINER", count);
    }
    public double getBasePrice() {
        return 400.0;
    }
}
public class MovieTicketCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Ticket[] bookings = new Ticket[n];
        double grandTotal = 0;
        for (int i = 0; i < n; i++) {
            String seat = sc.next();
            int count = sc.nextInt();
            if (seat.equalsIgnoreCase("REGULAR")) {
                bookings[i] = new RegularTicket(count);
            } else if (seat.equalsIgnoreCase("PREMIUM")) {
                bookings[i] = new PremiumTicket(count);
            } else if (seat.equalsIgnoreCase("RECLINER")) {
                bookings[i] = new ReclinerTicket(count);
            }
        }
        for (int i = 0; i < n; i++) {
            double total = bookings[i].calculateTotal();
            System.out.printf("%s: %.2f\n", bookings[i].type, total);
            grandTotal += total;
        }
        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}
