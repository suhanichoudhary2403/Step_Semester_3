import java.util.Scanner;
class Course {
    String code;
    String title;
    int credits;
    int labCredits;
    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }
    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }
    public int totalCredits() {
        return credits + labCredits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Theory-only Course Details:");
        System.out.print("Code: ");
        String c1 = sc.next();
        System.out.print("Title: ");
        String t1 = sc.next();
        System.out.print("Credits: ");
        int cr1 = sc.nextInt();
        Course course1 = new Course(c1, t1, cr1);
        System.out.println("Integrated Course Details:");
        System.out.print("Code: ");
        String c2 = sc.next();
        System.out.print("Title: ");
        String t2 = sc.next();
        System.out.print("Credits: ");
        int cr2 = sc.nextInt();
        System.out.print("Lab Credits: ");
        int lc2 = sc.nextInt();
        Course course2 = new Course(c2, t2, cr2, lc2);
        System.out.println(course1.code + " total credits: " + course1.totalCredits());
        System.out.println(course2.code + " total credits: " + course2.totalCredits());
        sc.close();
    }
}
