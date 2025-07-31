import java.util.Scanner;
public class Average {
    public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Num 1 = ");
    int num1 = scanner.nextInt();

    System.out.print("Num 2 = ");
    int num2 = scanner.nextInt();

    System.out.print("Num 3 = ");
    int num3 = scanner.nextInt();

    System.out.print("Num 4 = ");
    int num4 = scanner.nextInt();

    System.out.print("Num 5 = ");
    int num5 = scanner.nextInt();

    int sum= num1+num2+num3+num4+num5;
    System.out.println("Sum is "+sum);

    System.out.print("Number of average is ");
    int av= scanner.nextInt();

    int average= sum/av;
    System.out.println("Average is "+average);

    }
}