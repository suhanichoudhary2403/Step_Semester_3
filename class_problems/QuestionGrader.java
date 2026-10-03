import java.util.Scanner;
public class QuestionGrader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of questions: ");
        int n = sc.nextInt();
        double totalScore = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (MCQ/TF/ESSAY): ");
            String type = sc.next();
            sc.nextLine();
            System.out.print("Enter question text: ");
            sc.nextLine();
            System.out.print("Enter correct answer/keywords: ");
            String correct = sc.nextLine();
            System.out.print("Enter student answer: ");
            String student = sc.nextLine();
            System.out.print("Enter total points: ");
            double points = sc.nextDouble();
            double score = 0.0;
            if (type.equalsIgnoreCase("MCQ") || type.equalsIgnoreCase("TF")) {
                if (student.equalsIgnoreCase(correct)) {
                    score = points;
                }
            } else if (type.equalsIgnoreCase("ESSAY")) {
                String[] keywords = correct.split(",");
                int matchCount = 0;
                for (int j = 0; j < keywords.length; j++) {
                    if (student.toLowerCase().contains(keywords[j].trim().toLowerCase())) {
                        matchCount++;
                    }
                }
                if (matchCount >= 2) {
                    score = points * 0.75;
                } else if (matchCount == 1) {
                    score = points * 0.50;
                }
            }
            System.out.printf("%s: %.2f\n", type.toUpperCase(), score);
            totalScore += score;
        }
        System.out.printf("Total Score: %.2f\n", totalScore);
        sc.close();
    }
}
