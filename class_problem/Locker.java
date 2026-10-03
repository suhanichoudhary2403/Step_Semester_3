import java.util.Scanner;
class Locker {
    private final int lockerNumber;
    private String combinationCode;
    public Locker(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.combinationCode = initialCode;
    }
    public void changeCode(String currentCode, String newCode) {
        if (this.combinationCode.equals(currentCode)) {
            this.combinationCode = newCode;
            System.out.println("Success");
        } else {
            System.out.println("Rejected, code is still untouched");
        }
    }
    public int getLockerNumber() {
        return lockerNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Locker Number: ");
        int num = sc.nextInt();
        System.out.print("Set Initial 4-digit Code: ");
        String initCode = sc.next();
        Locker locker = new Locker(num, initCode);
        System.out.print("Enter Current Code to authorize change: ");
        String currentTry = sc.next();
        System.out.print("Enter New Code: ");
        String newCode = sc.next();
        locker.changeCode(currentTry, newCode);
        sc.close();
    }
}
