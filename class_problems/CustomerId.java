import java.util.Scanner;
public class CustomerId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed = reversed + name.charAt(i);
        }
        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reversed);        
        scanner.close();
    }
}
