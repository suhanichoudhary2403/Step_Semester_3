public class Numbers {
    public static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Output for n = 5:");
        printNumbersUpToN(5);
    }
}
