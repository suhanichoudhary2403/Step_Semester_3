import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n--- Person " + i + " ---");
            System.out.print("Enter weight (in kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height (in meters): ");
            double height = scanner.nextDouble();
            double bmi = weight / (height * height);
            System.out.println("BMI is: " + bmi);
            if (bmi < 18.5) {
                System.out.println("Status: Underweight");
            } else if (bmi >= 18.5 && bmi < 25.0) {
                System.out.println("Status: Normal");
            } else if (bmi >= 25.0 && bmi < 30.0) {
                System.out.println("Status: Overweight");
            } else {
                System.out.println("Status: Obese");
            }
        }
        scanner.close();
    }
}
