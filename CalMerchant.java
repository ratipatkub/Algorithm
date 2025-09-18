import java.util.Scanner;
public class calMerchant{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

         int price = 25;
         System.out.println("Enter the price of the product(per unit): "+price);

         System.out.print("Enter the quantity of product: ");
         int quantity = scanner.nextInt();

         double totalprice = price * quantity;

            if(quantity > 10){
             System.out.println("You get a 10% discount!!");
            double discount = totalprice * 0.10;
           totalprice = price * quantity - discount;
          System.out.println("total price: "+totalprice);
         } else {
         System.out.println("total price: "+totalprice);
         }
    }
}