import java.util.Scanner;
class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;
    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }
    public void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlacementRecord[] records = new PlacementRecord[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Company: ");
            String company = sc.next();
            System.out.print("Package (LPA): ");
            double packageLpa = sc.nextDouble();
            records[i] = new PlacementRecord(name, company, packageLpa);
        }
        System.out.println("\n--- Placement Records ---");
        for (int i = 0; i < 3; i++) {
            records[i].printRecord();
        }
        sc.close();
    }
}
