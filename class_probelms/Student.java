import java.util.Scanner;
class Student {
    String name;
    int attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;
    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name for Student 1: ");
        String name1 = sc.next();
        System.out.print("Enter attendance for Student 1: ");
        int att1 = sc.nextInt();
        Student s1 = new Student(name1, att1);
        System.out.print("Enter name for Student 2: ");
        String name2 = sc.next();
        System.out.print("Enter attendance for Student 2: ");
        int att2 = sc.nextInt();
        Student s2 = new Student(name2, att2);
        System.out.println("\n--- College Info Output ---");
        Student.printCollegeInfo();
        sc.close();
    }
}
