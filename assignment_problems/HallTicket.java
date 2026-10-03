import java.util.Scanner;
class HallTicket {
    String studentName;
    int seatNumber;
    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.next();
        HallTicket priya = new HallTicket(name, 0);
        HallTicket copy = priya;
        System.out.print("Enter updated seat number via copy reference variable: ");
        int newSeat = sc.nextInt();
        copy.seatNumber = newSeat;
        System.out.println(priya.studentName + "'s seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));
        HallTicket separate = new HallTicket(name, newSeat);
        System.out.println("separate == priya: " + (separate == priya));
        sc.close();
    }
}
