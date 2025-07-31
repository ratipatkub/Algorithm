import java.util.Scanner;
public class Circle {
        public static void main(String args[]){
                
                Scanner scanner = new Scanner(System.in);
              
              final double pi = 3.14159;

              System.out.print("Enter radius = ");
              double radius = scanner.nextInt();

              final double area= pi*radius*radius;
              System.out.println("Area of Circle that has radius = "+radius+" meters is " +area+ " square meters.");
        }
}