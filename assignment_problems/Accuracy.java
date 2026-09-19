import java.util.Scanner;
class Accuracy {
    public static void checkTypingAccuracy(String original, String typed) {
        int totalChar = original.length();
        int matchedChar = 0;
        int firstMismatch = -1;

        for (int i = 0; i < totalChar; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchedChar++;
            } else {
                if (firstMismatch == -1) {
                    firstMismatch = i;
                }
            }
        }
        double accuracy = ((double) matchedChar / totalChar) * 100;
        System.out.print("Matched: " + matchedChar + "/" + totalChar + " | ");
        System.out.printf("Accuracy: %.2f%% | ", accuracy);

        if (matchedChar == totalChar) {
            System.out.println("No Mismatches");
        } else {
            System.out.println("First Mismatch at position " + (firstMismatch + 1) + 
                               " ('" + original.charAt(firstMismatch) + 
                               "' vs '" + typed.charAt(firstMismatch) + "')");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original text: ");
        String original = sc.nextLine();        
        System.out.print("Enter typed text:    ");
        String typed = sc.nextLine();
        checkTypingAccuracy(original, typed);
        sc.close();
    }
}
