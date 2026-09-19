import java.util.Scanner;
public class SeatChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number of elements: ");
        int size = scanner.nextInt();
        int[] seats = new int[size];
        
        System.out.println("Enter the seat numbers:");
        for (int i = 0; i < size; i++) {
            seats[i] = scanner.nextInt();
        }
        boolean duplicateFound = false;
                for (int i = 0; i < seats.length; i++) {
            for (int j = i + 1; j < seats.length; j++) {
                if (seats[i] == seats[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seats[i]);
                    duplicateFound = true;
                    break; 
                }
            }
        }
        if (duplicateFound == false) {
            System.out.println("No Duplicate Seats Found");
        }
        scanner.close();
    }
}
