import java.util.Scanner;
import java.util.Arrays;
public class FantasyScoreMultiplier {
    public static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        playerScores[captainIndex] = playerScores[captainIndex] * 2.0;
        playerScores[viceCaptainIndex] = playerScores[viceCaptainIndex] * 1.5;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = sc.nextInt();
        double[] scores = new double[n];
        System.out.println("Enter " + n + " player scores one by one:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
        }
        System.out.print("Enter Captain Index: ");
        int captainIndex = sc.nextInt();
        System.out.print("Enter Vice-Captain Index: ");
        int viceCaptainIndex = sc.nextInt();
        applyMultipliers(scores, captainIndex, viceCaptainIndex);
        System.out.println("Final Scores: " + Arrays.toString(scores));
        sc.close();
    }
}
