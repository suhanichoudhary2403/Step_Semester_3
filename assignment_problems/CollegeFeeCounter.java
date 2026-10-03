import java.util.Scanner;
interface Transportable {
    double getTransportFee();
}
abstract class Student {
    String name;
    public Student(String name) {
        this.name = name;
    }
    public abstract double getTuition();
}
class DayScholar extends Student implements Transportable {
    public DayScholar(String name) {
        super(name);
    }
    public double getTuition() {
        return 40000.0;
    }
    public double getTransportFee() {
        return 12000.0;
    }
}
class Hosteller extends Student {
    public Hosteller(String name) {
        super(name);
    }
    public double getTuition() {
        return 40000.0 + 60000.0;
    }
}
class ScholarStudent extends Student implements Transportable {
    public ScholarStudent(String name) {
        super(name);
    }
    public double getTuition() {
        return 20000.0;
    }
    public double getTransportFee() {
        return 12000.0;
    }
}
public class CollegeFeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        double totalCollected = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            if (type.equalsIgnoreCase("DAY_SCHOLAR")) {
                students[i] = new DayScholar(name);
            } else if (type.equalsIgnoreCase("HOSTELLER")) {
                students[i] = new Hosteller(name);
            } else if (type.equalsIgnoreCase("SCHOLAR")) {
                students[i] = new ScholarStudent(name);
            }
        }
        for (int i = 0; i < n; i++) {
            double totalFee = students[i].getTuition();
            if (students[i] instanceof Transportable) {
                totalFee += ((Transportable) students[i]).getTransportFee();
            }
            System.out.printf("%s: %.2f\n", students[i].name, totalFee);
            totalCollected += totalFee;
        }
        System.out.printf("Total Collected: %.2f\n", totalCollected);
        sc.close();
    }
}
