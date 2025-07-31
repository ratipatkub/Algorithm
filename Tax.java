import java.util.Scanner;
public class Tax {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        double taxpercent = 0.10;

        System.out.print("Please enter your money = ");
        int money = scanner.nextInt();

        double tax = money*taxpercent;
        System.out.println("Tax payable is "+tax+" bath");
    }
}