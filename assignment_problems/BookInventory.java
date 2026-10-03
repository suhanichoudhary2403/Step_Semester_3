import java.util.Scanner;
class BookInventory {
    String title;
    String author;
    int copiesAvailable;
    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }
    public void printEntry() {
        System.out.println(title + " by " + author + " - " + copiesAvailable + " copies available");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookInventory[] inventory = new BookInventory[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Copies Available: ");
            int copies = sc.nextInt();
            sc.nextLine();
            inventory[i] = new BookInventory(title, author, copies);
        }
        System.out.println("\n--- Library Inventory Entries ---");
        for (int i = 0; i < 4; i++) {
            inventory[i].printEntry();
        }
        sc.close();
    }
}
