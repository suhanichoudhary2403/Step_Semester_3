import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};
        int rounds = 5;
        String[] playerMoves = new String[rounds];
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];
        int wins = 0, losses = 0, draws = 0;
        System.out.println("Rock-Paper-Scissors Game");
        for (int i = 0; i < rounds; i++) {
            System.out.print("\nRound " + (i + 1) + " - Enter choice (Rock, Paper, Scissors): ");
            String playerMove = scanner.next();
            int randomIndex = random.nextInt(3);
            String computerMove = options[randomIndex];
            String result = playRound(playerMove, computerMove);
            playerMoves[i] = playerMove;
            computerMoves[i] = computerMove;
            results[i] = result;
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            System.out.println("Computer chose: " + computerMove + " -> " + result);
        }
        System.out.printf("%s | %s | %s | %s\n", "Round", "Player Move", "Computer Move", "Result");
        for (int i = 0; i < rounds; i++) {
            System.out.printf("Round %-5d | %-12s | %-13s | %-15s\n", (i + 1), playerMoves[i], computerMoves[i], results[i]);
        }
        double winPercentage = ((double) wins / rounds) * 100;
        System.out.printf("Final Summary: Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", wins, losses, draws, winPercentage);        
        scanner.close();
    }
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
            if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }
}
