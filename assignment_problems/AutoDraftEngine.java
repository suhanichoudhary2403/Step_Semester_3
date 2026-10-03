import java.util.Scanner;
import java.util.Arrays;
class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;
    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }
    public int compareTo(Player other) {
        if (this.battingAverage < other.battingAverage) {
            return 1;
        } else if (this.battingAverage > other.battingAverage) {
            return -1;
        }
        return 0;
    }
}
public class AutoDraftEngine {
    public static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }
    public static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }
    public static String draftAndRank(Player[] players) {
        Player[] temp = new Player[players.length];
        int count = 0;
        for (int i = 0; i < players.length; i++) {
            Player p = players[i];
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured)) {
                temp[count] = p;
                count++;
            }
        }
        Player[] draftable = Arrays.copyOf(temp, count);
        Arrays.sort(draftable);
        String result = "";
        for (int i = 0; i < draftable.length; i++) {
            result += (i + 1) + ". " + draftable[i].name;
            if (i < draftable.length - 1) {
                result += " | ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players to process: ");
        int n = sc.nextInt();
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Matches: ");
            int matches = sc.nextInt();
            System.out.print("Average: ");
            double avg = sc.nextDouble();
            System.out.print("Injured (true/false): ");
            boolean injured = sc.nextBoolean();
            players[i] = new Player(name, matches, avg, injured);
        }
        System.out.println("Draft Result: " + draftAndRank(players));
        sc.close();
    }
}
