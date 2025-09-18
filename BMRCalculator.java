    import java.util.Scanner;
    public class BMRCalculator{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your gender: ");
            String gender = scanner.nextLine();

            
                System.out.print("Enter your weight : ");
                int weight = scanner.nextInt();

                System.out.print("Enter your height: ");
                int height = scanner.nextInt();

                System.out.print("Enter your age: ");
                int age = scanner.nextInt();

                
            if(gender.equals("male")){
               double BMR = 66 +(13.7*weight) + (5* height) - (6.8 * age);
                System.out.println("Your BMR for weight is "+weight+" kg and height = "+height+ "centimeter is "+BMR+ " bmr.");
            } if(gender.equals("female")){
                double BMR = 655 +(9.6*weight) + (1.8* height) - (4.7 * age);
                System.out.println("Your BMR for weight is "+weight+" kg and height = "+height+ "centimeter is "+BMR+ " bmr.");
            }
        }
    }