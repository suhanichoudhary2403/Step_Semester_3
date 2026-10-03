import java.util.Scanner;
abstract class Staff {
    String name;
    public Staff(String name) {
        this.name = name;
    }
    public abstract double calculatePay();
}
class FullTimeStaff extends Staff {
    double weeklySalary;
    public FullTimeStaff(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }
    public double calculatePay() {
        return weeklySalary;
    }
}
class HourlyStaff extends Staff {
    double hours, rate;
    public HourlyStaff(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }
    public double calculatePay() {
        if (hours <= 40) {
            return hours * rate;
        }
        return (40 * rate) + ((hours - 40) * 1.5 * rate);
    }
}
class InternStaff extends Staff {
    double stipend;
    public InternStaff(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }
    public double calculatePay() {
        return stipend;
    }
}
public class WeeklyStaffPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Staff[] team = new Staff[n];
        double totalPayroll = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            if (type.equalsIgnoreCase("FULLTIME")) {
                team[i] = new FullTimeStaff(name, sc.nextDouble());
            } else if (type.equalsIgnoreCase("HOURLY")) {
                team[i] = new HourlyStaff(name, sc.nextDouble(), sc.nextDouble());
            } else if (type.equalsIgnoreCase("INTERN")) {
                team[i] = new InternStaff(name, sc.nextDouble());
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%s: %.2f\n", team[i].name, team[i].calculatePay());
            totalPayroll += team[i].calculatePay();
        }
        System.out.printf("Total Payroll: %.2f\n", totalPayroll);
        sc.close();
    }
}
