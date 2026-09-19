import java.util.Scanner;
public class WordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            String reversedWord = "";
            for (int j = currentWord.length() - 1; j >= 0; j--) {
                reversedWord += currentWord.charAt(j);
            }
            if (i == 0) {
                result += reversedWord;
            } else {
                result += " " + reversedWord;
            }
        }
        System.out.println("Output: " + result);
        sc.close();
    }
}
