import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int originalNumber = number, result = 0;
        int numberOfDigits = String.valueOf(number).length();
        
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, numberOfDigits);
            originalNumber /= 10;
        }
        
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}
