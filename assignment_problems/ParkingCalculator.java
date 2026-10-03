import java.util.Scanner;
public class ParkingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int hours = sc.nextInt();
            double charge = 0;
            if (type.equalsIgnoreCase("BIKE")) {
                charge = hours * 10;
            } else if (type.equalsIgnoreCase("CAR")) {
                charge = 30 + (hours - 1) * 20;
            } else if (type.equalsIgnoreCase("TRUCK")) {
                charge = hours * 50;
                if (charge < 100) {
                    charge = 100;
                }
            }
            System.out.printf("%s: %.2f\n", type.toUpperCase(), charge);
            total += charge;
        }
        System.out.printf("Total: %.2f\n", total);
        sc.close();
    }
}
