import java.util.Scanner;
public class Warehouse {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;        
        int highestQuantity = sectionA[0];
        String highestSection = "Section A";
        int highestIndex = 0;
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];   
            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }
        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";
        System.out.print("Section A Total: " + totalA + " | ");
        System.out.print("Section B Total: " + totalB + " | ");
        System.out.print("Status: " + status + " | ");
        System.out.println("Highest Quantity: " + highestQuantity + " (" + highestSection + ", Item " + (highestIndex + 1) + ")");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items per section: ");
        int n = scanner.nextInt();
        int[] sectionA = new int[n];
        int[] sectionB = new int[n];
        System.out.println("Enter quantities for Section A:");
        for (int i = 0; i < n; i++) {
            sectionA[i] = scanner.nextInt();
        }
        System.out.println("Enter quantities for Section B:");
        for (int i = 0; i < n; i++) {
            sectionB[i] = scanner.nextInt();
        }
        analyzeInventory(sectionA, sectionB);
        scanner.close();
    }
}
