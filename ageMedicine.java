import java.util.Scanner;
public class ageMedicine{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age > 10){
            System.out.print("Take 2 teaspoons.");
        }
        else if(age > 3){
            System.out.print("Take 1 teaspoons.");
        }
        else if(age > 1){
            System.out.print("take 1/2 teaspoons.");
        }
        else if(age >= 0){
            System.out.print("Do not take medicine");
        }
        else{
            System.out.print("Wrong age, Please enter your age correctly.");
        }

    }
}