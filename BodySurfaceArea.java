import java.util.Scanner;
public class BodySurfaceArea {
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter width :");
        int width = scanner.nextInt();

        System.out.print("enter length :");
        int length = scanner.nextInt();

        final double BSA= (width*length)/360.0;
        System.out.println("Your BSA is "+BSA);


    }
}