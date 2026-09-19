import java.util.Scanner;
public class SignalAnalyzer {
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.length() == 0) {
            System.out.println("No signals recorded.");
            return;
        }
        char longestColor = signalLog.charAt(0);
        int maxStreak = 1;
        char currentColor = signalLog.charAt(0);
        int currentStreak = 1;
        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentColor) {
                currentStreak++;
            } else {
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                    longestColor = currentColor;
                }
                currentColor = signalLog.charAt(i);
                currentStreak = 1;
            }
        }
        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
            longestColor = currentColor;
        }
        System.out.println("Longest Streak: '" + longestColor + "' repeated " + maxStreak + " times");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter traffic signal log: ");
        String log = scanner.next();
        findLongestStreak(log);
        scanner.close();
    }
}
