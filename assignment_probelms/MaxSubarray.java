import java.util.Scanner;
public class MaxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < size; i++) {
            if (currentSum + nums[i] > nums[i]) {
                currentSum = currentSum + nums[i];
            } else {
                currentSum = nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
        sc.close();
    }
}