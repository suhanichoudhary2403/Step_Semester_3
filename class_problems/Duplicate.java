import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        boolean duplicateFound = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicateFound = true;
                    break;
                }
            }
            if (duplicateFound == true) {
                break;
            }
        }
        if (duplicateFound == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
