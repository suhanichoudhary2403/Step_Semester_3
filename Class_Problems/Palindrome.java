import java.util.Scanner;
public class Palindrome{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=s.nextInt();
        int originalNumber=number;
        int reversedNumber = 0;
        while(number>0){
            int lastDigit=number%10;
            reversedNumber= reversedNumber*10+lastDigit;
            number = number/10;
        }
        if(originalNumber==reversedNumber){
            System.out.println("It is a palindrome.");
        }
        else {
            System.out.println("It is not a Palindrome.");
        }
    }
}