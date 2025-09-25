import java.util.Scanner;
public class memberDiscount{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter membership level (Silver, Gold, Platinum): ");
        String memberLevel = scanner.nextLine();

        System.out.print("Enter total purchase amount: ");
        double totalPrice = scanner.nextInt();
        System.out.println();

        System.out.println("--- Receipt ---");

        if(memberLevel.equalsIgnoreCase("Silver")){
            System.out.println("Member level: "+memberLevel);
            System.out.println("Total purchase: "+totalPrice);            
            double discount = totalPrice * 0.05;
            System.out.println("discount: "+discount);
            double finalPrice = totalPrice - discount;
            System.out.print("Final price: "+finalPrice);
        }
        else if (memberLevel.equalsIgnoreCase("Gold")){
            System.out.println("Member level: "+memberLevel);
            System.out.println("Total purchase: "+totalPrice);            
            double discount = totalPrice * 0.10;
            System.out.println("discount: "+discount);
            double finalPrice = totalPrice - discount;
            System.out.print("Final price: "+finalPrice);
        }
        else if (memberLevel.equalsIgnoreCase("Platinum")){
            System.out.println("Member level: "+memberLevel);
            System.out.println("Total purchase: "+totalPrice);            
            double discount = totalPrice * 0.15;
            System.out.println("discount: "+discount);
            double finalPrice = totalPrice - discount;
            System.out.print("Final price: "+finalPrice);
        } 
        else if (memberLevel.equalsIgnoreCase("Other")){
            System.out.println("Member level: "+memberLevel);
            System.out.println("Total purchase: "+totalPrice);  
        } else
        System.out.print("Wrong!!!!!!!");
    }

}