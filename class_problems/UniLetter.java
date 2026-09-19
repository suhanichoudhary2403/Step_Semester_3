import java.util.Scanner;
public class UniLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = scanner.next();
        char uniqueChar = ' ';
        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueChar = current;
                found = true;
                break; 
            }
        }
        if (found) {
            System.out.println("First unique character is: " + uniqueChar);
        } else {
            System.out.println("No unique character found.");
        }
        scanner.close();
    }
}
