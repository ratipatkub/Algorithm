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
        
<<<<<<< HEAD
        System.out.println("Pen: 4.0 Bath");

        System.out.println("Pencil: 6.0 Bath");

        System.out.println("Book: 13.0 Bath");

        double totalprice = price1+price2+price3;
        System.out.println("Total price before tax: "+totalprice+" bath");

        double vat = totalprice*0.07;
        System.out.println("VAT = "+vat+ " bath");

        double netprice = totalprice+vat;
        System.out.println("Net price "+netprice+ " bath");
        
        double totalpaid = customermoney;
        System.out.println("Total paid "+totalpaid+ " bath");

        double change = customermoney-netprice;
        System.out.println("Change = "+change+ " bath");
=======
        System.out.printf("Pen: "+ (float)price1 "Bath");
        
>>>>>>> a4d2a6b68fb034c99d31e7c0eaf853a7c1889577
    }
}