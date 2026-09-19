import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int[] answer = new int[size];
        int leftProduct = 1;
        for (int i = 0; i < size; i++) {
            answer[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }
        int rightProduct = 1;
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(answer[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
