import java.util.Scanner;
public class TransportFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of journeys: ");
        int n = sc.nextInt();
        double grandTotal = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter transport type (BUS/TRAIN/METRO): ");
            String type = sc.next();
            System.out.print("Enter distance (km): ");
            double distance = sc.nextDouble();
            double fare = 0.0;
            if (type.equalsIgnoreCase("BUS")) {
                fare = 2.0 + (0.10 * distance);
                if (fare > 10.0) {
                    fare = 10.0;
                }
            } else if (type.equalsIgnoreCase("TRAIN")) {
                fare = 3.0 + (0.15 * distance);
            } else if (type.equalsIgnoreCase("METRO")) {
                System.out.print("Enter peak hour factor (1.0 to 2.0): ");
                double factor = sc.nextDouble();
                fare = (1.50 + (0.20 * distance)) * factor;
            }
            System.out.printf("%s: %.2f\n", type.toUpperCase(), fare);
            grandTotal += fare;
        }
        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}
