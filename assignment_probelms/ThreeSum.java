import java.util.Scanner;
public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("\n--- Unique Triplets ---");
        for (int i = 0; i < size - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = size - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    System.out.println("[" + nums[i] + ", " + nums[left] + ", " + nums[right] + "]");
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; 
                } else {
                    right--;
                }
            }
        }
        sc.close();
    }
}
