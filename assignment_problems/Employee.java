import java.util.Scanner;
class Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }
    public Employee(String empId, String empName) {
        this(empId, empName, 0.0);
        this.isIntern = true;
    }
    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Permanent Employee details:");
        System.out.print("ID: ");
        String id1 = sc.next();
        System.out.print("Name: ");
        String name1 = sc.next();
        System.out.print("Salary: ");
        double sal1 = sc.nextDouble();
        Employee emp1 = new Employee(id1, name1, sal1);
        System.out.println("Enter Intern Employee details:");
        System.out.print("ID: ");
        String id2 = sc.next();
        System.out.print("Name: ");
        String name2 = sc.next();
        Employee emp2 = new Employee(id2, name2);
        System.out.println("\n--- Employee Profiles ---");
        emp1.printProfile();
        emp2.printProfile();
        sc.close();
    }
}
