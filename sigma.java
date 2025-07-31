import java.util.Scanner;
public class sigma {
 public static void main(String args[]) {
     // For keyboard input
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the base of triangle: ");
     int base = scanner.nextInt();
     
     System.out.print("Enter the height of triangle: ");
     int high = scanner.nextInt();

     double TriangleArea = 0.5*base*high;
     System.out.println("Area of the triangle: "+TriangleArea+" Square units");
    
    System.out.println("----------------------------------------");


    System.out.print("Enter the lenght of rectangle: ");
     int side1 = scanner.nextInt();

     System.out.print("Enter the height of rectangle: ");
     int side2 = scanner.nextInt();
    
    
    double RectangleArea  = side1*side2;
    System.out.println("Area of the rectangle: "+RectangleArea+" Square units");
   }
}