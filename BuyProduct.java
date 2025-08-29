import java.util.Scanner;
public class BuyProduct{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Product #1 name: ");
        String name1 = scanner.nextLine();

        System.out.print("Product #1 price: ");
        int price1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Product #2 name: ");
        String name2 = scanner.nextLine();

        System.out.print("Product #2 price: ");
        int price2 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Product #3 name: ");
        String name3 = scanner.nextLine();

        System.out.print("Product #3 price: ");
        int price3 = scanner.nextInt();

        System.out.print("Customer paid money: ");
        int customermoney = scanner.nextInt();

        System.out.println("-----------Receipt--------------");
        
        System.out.printf("Pen: "+ (float)price1 "Bath");
        
    }
}