import java.util.Scanner;
public class SwappingNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
       
       System.out.println("Current -> number1 = "+num1+ " and number2 = "+num2);

       System.out.println("Swapping........");
       
       int now = num1^num2;
       System.out.println("Now -> number1 = "+num2+ " and number2 = "+num1);
    }
}