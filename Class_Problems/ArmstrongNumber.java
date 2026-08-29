import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=s.nextInt();
        int originalNumber=number;
        int sum=0;
        while(number>0){
            int lastDigit=number%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            number=number/10;
        }
        if (originalNumber==sum){
            System.out.println("It is an armstrong number.");
        }
        else{
            System.out.println("It is not an armstrong number.");
        }
    }
}