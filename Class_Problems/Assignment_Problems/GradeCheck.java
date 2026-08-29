public class GradeCheck {
    public static void classifyWithAttendance(int marks, int attendance) {
        boolean isEligible = (attendance >= 75) && (marks >= 40);
        if (!isEligible) {
            System.out.println("Detained");
        } 
        else {
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Input: marks = 82, attendance = 80 ->  ");
        classifyWithAttendance(82, 80);
        System.out.print("Input: marks = 91, attendance = 60 ->  ");
        classifyWithAttendance(91, 60);
    }
}
