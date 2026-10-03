import java.util.Scanner;
public class HostelElectricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();
            double bill = 0;
            if (type.equalsIgnoreCase("SINGLE")) {
                bill = units * 8;
            } else if (type.equalsIgnoreCase("SHARED")) {
                int occupants = sc.nextInt();
                bill = (units * 6.0) / occupants;
            } else if (type.equalsIgnoreCase("AC")) {
                bill = (units * 10) + 200;
            }
            System.out.printf("%s: %.2f\n", type.toUpperCase(), bill);
            total += bill;
        }
        System.out.printf("Total: %.2f\n", total);
        sc.close();
    }
}
