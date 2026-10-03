import java.util.Scanner;
class Scorecard {
    private boolean[] results;
    private int count;
    public Scorecard(int totalQuestions) {
        this.results = new boolean[totalQuestions];
        this.count = 0;
    }
    public void recordAnswer(boolean isCorrect) {
        if (count >= results.length) {
            System.out.println("Rejected: Scorecard is already full.");
        } else {
            results[count] = isCorrect;
            count++;
        }
    }
    public int getScore() {
        int score = 0;
        for (int i = 0; i < count; i++) {
            if (results[i]) {
                score++;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of questions: ");
        int total = sc.nextInt();
        Scorecard scorecard = new Scorecard(total);
        for (int i = 0; i < total; i++) {
            System.out.print("Is answer " + (i + 1) + " correct? (true/false): ");
            boolean ans = sc.nextBoolean();
            scorecard.recordAnswer(ans);
        }
        System.out.println("Final Score: " + scorecard.getScore());
        sc.close();
    }
}
