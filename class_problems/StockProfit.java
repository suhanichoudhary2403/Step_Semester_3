import java.util.Scanner;
public class StockProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();
        int[] prices = new int[days];
        System.out.println("Enter the daily prices:");
        for (int i = 0; i < days; i++) {
            prices[i] = sc.nextInt();
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        System.out.println("Max Profit: " + maxProfit);
        sc.close();
    }
}
