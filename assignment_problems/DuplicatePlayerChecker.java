import java.util.Scanner;
public class DuplicatePlayerChecker {
    public static String findDuplicatePick(String[] playerNames) {
        for (int i = 0; i < playerNames.length; i++) {
            for (int j = i + 1; j < playerNames.length; j++) {
                if (playerNames[i].equals(playerNames[j])) {
                    return "Duplicate Found: " + playerNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players in lineup: ");
        int n = sc.nextInt();
        String[] players = new String[n];
        System.out.println("Enter " + n + " player names one by one:");
        for (int i = 0; i < n; i++) {
            players[i] = sc.next();
        }
        System.out.println(findDuplicatePick(players));
        sc.close();
    }
}
