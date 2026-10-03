import java.util.Scanner;
import java.time.LocalDate;
public class StreamingRenewal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            String dateStr = sc.next();
            LocalDate startDate = LocalDate.parse(dateStr);
            int days = 0;
            if (type.equalsIgnoreCase("BASIC")) {
                days = 30;
            } else if (type.equalsIgnoreCase("STANDARD")) {
                days = 90;
            } else if (type.equalsIgnoreCase("PREMIUM")) {
                days = 365;
            }
            LocalDate renewalDate = startDate.plusDays(days);
            System.out.println(name + ": " + renewalDate);
        }
        sc.close();
    }
}
