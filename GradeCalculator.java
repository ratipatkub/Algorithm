import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter score (0-100): ");
        int score = scanner.nextInt();
          
        if((score < 0)||(score > 100)){
            System.out.print("Wrong score");            
        }
        else if(score >= 80){
            System.out.println("---Result---");
            System.out.println("Name : "+studentName);
            System.out.println("Score: "+score);
            System.out.print("Grade: A");
        }
        else if (score >= 70){
            System.out.println("---Result---");
            System.out.println("Name : "+studentName);
            System.out.println("Score: "+score);
            System.out.print("Grade: B");
        }
        else if (score >= 60){
            System.out.println("---Result---");
            System.out.println("Name : "+studentName);
            System.out.println("Score: "+score);
            System.out.print("Grade: C");
        }
        else if (score >= 50){
            System.out.println("---Result---");
            System.out.println("Name : "+studentName);
            System.out.println("Score: "+score);
            System.out.print("Grade: D");
        }
        else{
            System.out.println("---Result---");
            System.out.println("Name : "+studentName);
            System.out.println("Score: "+score);
            System.out.print("Grade: E");
        }
    }
}