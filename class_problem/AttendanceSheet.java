import java.util.Scanner;
class AttendanceSheet {
    private String[] presentStudents;
    private int count;
    public AttendanceSheet(int maxClassSize) {
        this.presentStudents = new String[maxClassSize];
        this.count = 0;
    }
    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (presentStudents[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
    public void markPresent(String name) {
        if (isPresent(name)) {
            return;
        }
        if (count < presentStudents.length) {
            presentStudents[count] = name;
            count++;
        }
    }
    public int getPresentCount() {
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum class size: ");
        int size = sc.nextInt();
        AttendanceSheet sheet = new AttendanceSheet(size);
        System.out.print("How many names do you want to submit? ");
        int trackingCount = sc.nextInt();
        for (int i = 0; i < trackingCount; i++) {
            System.out.print("Mark present (Name): ");
            String name = sc.next();
            sheet.markPresent(name);
        }
        System.out.println("Total Unique Present: " + sheet.getPresentCount());
        System.out.print("Enter a name to search look up: ");
        String lookupName = sc.next();
        System.out.println("Is present: " + sheet.isPresent(lookupName));
        sc.close();
    }
}
