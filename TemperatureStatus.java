import java.util.Scanner;
public class TemperatureStatus{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temperature = scanner.nextInt();

        if(temperature < 20){
            System.out.println("Temperature: "+temperature+" ํC");
            System.out.print("Status: Cold");
        }
        else if(((temperature >= 20) && temperature <= 35)){
            System.out.println("Temperature: "+temperature+" ํC");
            System.out.print("Status: Normal");
        }
        else{
            System.out.println("Temperature: "+temperature+" ํC");
            System.out.print("Status: Hot");
        }
    }
}