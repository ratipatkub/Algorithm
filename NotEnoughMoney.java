import java.util.Scanner;
public class NotEnoughMoney{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int customerMoney = 1000;

        System.out.print("Enter product price: ");
        int price = scanner.nextInt();

        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        
        int paidAmount = price*quantity;
        
        if (paidAmount <= 1000) {
         
        int change = customerMoney-paidAmount;
        System.out.println("Change is "+change+" bath");
        
        int fiveH = change/500;
         change = change % 500;

        int oneH = change/100;
         change = change % 100;

        int fiftyNote = change/50;
         change = change % 50;

        int twentyNote = change/20;
         change = change % 20;

        int tenCoin = change/10;
         change = change % 10;

        int fiveCoin = change/5;
         change = change % 5;

        int twoCoin = change/2;
         change = change % 2;

        int oneCoin = change/1;
         change = change % 1;

        System.out.println("Five-hundred note: "+fiveH+" note(s)");
        System.out.println("Hundred note: "+oneH+" note(s)");
        System.out.println("Fifty note: "+fiftyNote+" note(s)");
        System.out.println("Twenty note: "+twentyNote+" note(s)");
        System.out.println("Ten coin: "+tenCoin+" note(s)");
        System.out.println("Five coin: "+fiveCoin+" note(s)");
        System.out.println("Two coin: "+twoCoin+" note(s)");
        System.out.println("One coin: "+oneCoin+" note(s)");
        } else {
            System.out.print("Not enough money!!");
        }

        
    }
}