import java.util.Scanner;
abstract class LibraryItem {
    String title;
    int daysLate;
    public LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }
    public abstract double calculateFine();
}
class BookItem extends LibraryItem {
    public BookItem(String title, int daysLate) {
        super(title, daysLate);
    }
    public double calculateFine() {
        return daysLate * 2.0;
    }
}
class DvdItem extends LibraryItem {
    public DvdItem(String title, int daysLate) {
        super(title, daysLate);
    }
    public double calculateFine() {
        double fine = daysLate * 5.0;
        if (fine > 50.0) {
            fine = 50.0;
        }
        return fine;
    }
}
class MagazineItem extends LibraryItem {
    public MagazineItem(String title, int daysLate) {
        super(title, daysLate);
    }
    public double calculateFine() {
        return daysLate * 1.0;
    }
}
public class LibraryFineCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LibraryItem[] items = new LibraryItem[n];
        double totalFines = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();
            int days = sc.nextInt();
            if (type.equalsIgnoreCase("BOOK")) {
                items[i] = new BookItem(title, days);
            } else if (type.equalsIgnoreCase("DVD")) {
                items[i] = new DvdItem(title, days);
            } else if (type.equalsIgnoreCase("MAGAZINE")) {
                items[i] = new MagazineItem(title, days);
            }
        }
        for (int i = 0; i < n; i++) {
            double fine = items[i].calculateFine();
            System.out.printf("%s: %.2f\n", items[i].title, fine);
            totalFines += fine;
        }
        System.out.printf("Total Fines: %.2f\n", totalFines);
        sc.close();
    }
}
