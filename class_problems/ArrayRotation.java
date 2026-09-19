import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter rotation steps (k): ");
        int k = sc.nextInt();
        if (size > 0) {
            k = k % size;
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            int newPosition = (i + k) % size;
            result[newPosition] = nums[i];
        }
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
