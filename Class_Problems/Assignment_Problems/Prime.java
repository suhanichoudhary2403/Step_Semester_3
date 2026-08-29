public class Prime {
    public static void checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
    public static void main(String[] args) {
        System.out.print("Input: number = 17 -> Output: ");
        checkPrime(17); 
        System.out.print("Input: number = 18 -> Output: ");
        checkPrime(18); 
    }
}
