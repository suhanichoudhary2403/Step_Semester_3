import java.util.Scanner;
public class ArrayMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        if (size1 > 0) {
            System.out.println("Enter sorted elements for first array:");
            for (int i = 0; i < size1; i++) {
                arr1[i] = sc.nextInt();
            }
        }
        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        if (size2 > 0) {
            System.out.println("Enter sorted elements for second array:");
            for (int i = 0; i < size2; i++) {
                arr2[i] = sc.nextInt();
            }
        }
        int[] result = new int[size1 + size2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < size2) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        System.out.print("[");
        for (int m = 0; m < result.length; m++) {
            System.out.print(result[m]);
            if (m < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
