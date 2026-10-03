import java.util.Arrays;
import java.util.Scanner;
public class ScoreBooster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of teams: ");
        int n = sc.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        System.out.print("Enter the flat bonus amount: ");
        int bonus = sc.nextInt();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i] + bonus;
        }
        System.out.println(Arrays.toString(scores));
        sc.close();
    }
}
