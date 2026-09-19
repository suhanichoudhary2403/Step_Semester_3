import java.util.Scanner;
public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feedback text: ");
        String text = scanner.nextLine();
        text = text.toLowerCase().replace(".", "").replace(",", "");
        String[] words = text.split("\\s+");
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueCount = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean isStopWord = false;
            for (int j = 0; j < stopWords.length; j++) {
                if (word.equals(stopWords[j])) {
                    isStopWord = true;
                    break;
                }
            }
            if (isStopWord == true) {
                continue;
            }
            boolean alreadyExists = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueWords[j].equals(word)) {
                    counts[j]++; 
                    alreadyExists = true;
                    break;
                }
            }
            if (alreadyExists == false) {
                uniqueWords[uniqueCount] = word;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }
        for (int i = 0; i < uniqueCount; i++) {
            for (int j = i + 1; j < uniqueCount; j++) {
                if (counts[j] > counts[i]) {
                    int tempCount = counts[i];
                    counts[i] = counts[j];
                    counts[j] = tempCount;
                    String tempWord = uniqueWords[i];
                    uniqueWords[i] = uniqueWords[j];
                    uniqueWords[j] = tempWord;
                }
            }
        }
        System.out.println("\n--- Frequency Report ---");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueWords[i] + ": " + counts[i]);
        }
        scanner.close();
    }
}
