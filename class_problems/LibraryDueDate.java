import java.util.Scanner;
import java.time.LocalDate;
public class LibraryDueDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        LocalDate currentDate = LocalDate.of(2023, 10, 26);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item type (BOOK/DVD/MAGAZINE): ");
            String type = sc.next();
            System.out.print("Enter item title (without spaces): ");
            String title = sc.next();
            int days = 0;
            if (type.equalsIgnoreCase("BOOK")) {
                days = 14;
            } else if (type.equalsIgnoreCase("DVD")) {
                days = 7;
            } else if (type.equalsIgnoreCase("MAGAZINE")) {
                days = 3;
            }
            LocalDate dueDate = currentDate.plusDays(days);
            System.out.println(title + ": " + dueDate);
        }
        sc.close();
    }
}
