import java.util.Scanner;
public class BMIcalculator {
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        float height = scanner.nextFloat();

        final double BMI=weight/(height*height);
        System.out.println("Your BMI for weight ="+weight+"kg and height ="+height+"meters is: "+BMI+"bmi.");
    }
}