import java.util.Scanner;
class NameTag {
    private final String firstName;
    private final char lastInitial;
    public NameTag(String fullName) {
        String[] parts = fullName.split(" ");
        this.firstName = parts[0];
        this.lastInitial = parts[1].charAt(0);
    }
    public String getNickname() {
        return firstName + " " + lastInitial + ".";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Full Name (First Last): ");
        String firstName = sc.next();
        String lastName = sc.next();
        NameTag tag = new NameTag(firstName + " " + lastName);
        System.out.println("Nickname: " + tag.getNickname());
        sc.close();
    }
}
