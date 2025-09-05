import java.util.Scanner;
public class Ifshape{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose your choice 1 or 2: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            
            System.out.print("Enter the base of triangle: ");
        int base = scanner.nextInt();
     
        System.out.print("Enter the height of triangle: ");
        int high = scanner.nextInt();

        double TriangleArea = 0.5*base*high;
        System.out.println("Area of the triangle: "+TriangleArea+" Square units");
        } else {
             System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        final double BMI=weight/(height*height);
        System.out.println("Your BMI for weight ="+weight+"kg and height ="+height+"meters is: "+BMI+"bmi.");
        }
    }
}