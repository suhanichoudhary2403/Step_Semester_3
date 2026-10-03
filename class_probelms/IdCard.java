import java.util.Scanner;
class IdCard {
    String name;
    int booksIssued;
    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name for card: ");
        String nameInput = sc.next();
        IdCard ravi = new IdCard(nameInput, 0);
        IdCard duplicate = ravi;
        System.out.print("Enter books to issue via duplicate variable: ");
        int updateBooks = sc.nextInt();
        duplicate.booksIssued = updateBooks;
        System.out.println(ravi.name + "'s booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        IdCard separate = new IdCard(nameInput, updateBooks);
        System.out.println("separate == ravi: " + (separate == ravi));
        sc.close();
    }
}
