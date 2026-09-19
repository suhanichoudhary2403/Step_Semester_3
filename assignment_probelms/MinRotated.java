import java.util.Scanner;
public class MinRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int left = 0;
        int right = size - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            else {
                right = mid;
            }
        }
        System.out.println("Minimum Element: " + nums[left]);
        sc.close();
    }
}
