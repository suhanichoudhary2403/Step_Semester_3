import java.util.Scanner;
public class SubarraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum (k): ");
        int k = sc.nextInt();
        int count = 0;
            for (int i = 0; i < size; i++) {
            int currentSum = 0;
            for (int j = i; j < size; j++) {
                currentSum += nums[j];
                if (currentSum == k) {
                    count++;
                }
            }
        }
        System.out.println("Total Subarrays: " + count);
        sc.close();
    }
}
