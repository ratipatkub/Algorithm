import java.util.Scanner;
public class Fahrenheit{
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit: ");
        int fahrenheit = scanner.nextInt();

        double celsius = (5.0/9.0) * (fahrenheit-32);
        System.out.println(celsius+" celsius");
    }
}