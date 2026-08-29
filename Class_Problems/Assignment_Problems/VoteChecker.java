public class VoteChecker {
    public static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
    public static void main(String[] args) {
        System.out.print("Input: age = 20 -> Output: ");
        checkVotingEligibility(20); 
        System.out.print("Input: age = 16 -> Output: ");
        checkVotingEligibility(16);
    }
}
