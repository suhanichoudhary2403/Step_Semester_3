import java.util.Scanner;
public class DeliveryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of delivery requests: ");
        int n = sc.nextInt();
        double grandTotal = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter delivery type (STANDARD/EXPRESS/INTERNATIONAL): ");
            String type = sc.next();
            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();
            System.out.print("Enter distance (km): ");
            double distance = sc.nextDouble();
            double fee = 0.0;
            if (type.equalsIgnoreCase("STANDARD")) {
                fee = 5.0 + (0.50 * weight) + (0.10 * distance);
            } else if (type.equalsIgnoreCase("EXPRESS")) {
                fee = 15.0 + (1.00 * weight) + (0.20 * distance);
            } else if (type.equalsIgnoreCase("INTERNATIONAL")) {
                System.out.print("Enter customs fee: ");
                double customs = sc.nextDouble();
                fee = 25.0 + (2.00 * weight) + (0.50 * distance) + customs;
            }
            System.out.printf("%s: %.2f\n", type.toUpperCase(), fee);
            grandTotal += fee;
        }
        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}
