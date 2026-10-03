import java.util.Scanner;
public class MatchDayGridAnalyzer {
    private static double rowAverage(int[] row) {
        double sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }
        return sum / row.length;
    }
    public static String classifyMatches(int[][] runsPerOver, int threshold) {
        String result = "";
        for (int i = 0; i < runsPerOver.length; i++) {
            double avg = rowAverage(runsPerOver[i]);
            if (avg >= threshold) {
                result += "Match " + i + ": Power Surge";
            } else {
                result += "Match " + i + ": Normal";
            }
            if (i < runsPerOver.length - 1) {
                result += " | ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of matches: ");
        int totalMatches = sc.nextInt();
        int[][] runsPerOver = new int[totalMatches][];
        for (int i = 0; i < totalMatches; i++) {
            System.out.print("Enter total overs recorded for Match " + i + ": ");
            int totalOvers = sc.nextInt();
            runsPerOver[i] = new int[totalOvers];
            System.out.println("Enter runs scored in each over for Match " + i + ":");
            for (int j = 0; j < totalOvers; j++) {
                runsPerOver[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the score threshold: ");
        int threshold = sc.nextInt();
        System.out.println(classifyMatches(runsPerOver, threshold));
        sc.close();
    }
}
