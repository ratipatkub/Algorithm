import java.util.Scanner;
public class Dress{
    public static void main(String args[]){

         Scanner scanner = new Scanner(System.in);

    System.out.print("Enter price of one dress: ");
    int price = scanner.nextInt();

    System.out.print("Enter number of dresses to buy: ");
    int dress = scanner.nextInt();

    System.out.print("Enter discount rate: ");
    int discount = scanner.nextInt();

    System.out.println("----------------------------------------");

    int totalcost = price*dress;
    System.out.println("Total cost = "+totalcost+" Baht");

    double discountamount = totalcost*discount/100.0;
    System.out.println("discountAmount = "+discountamount+" Baht");

    double netpay = totalcost-discountamount;
    System.out.print("Net Pay = "+netpay+" Bath");
    }

   
}