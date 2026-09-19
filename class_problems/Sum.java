import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the prices:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target budget: ");
        int target = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    sc.close();
                    return;
                }
            }
        }
        sc.close();
    }
}
