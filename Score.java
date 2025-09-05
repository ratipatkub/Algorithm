import java.util.Scanner;
public class Score{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your midterm score: ");
        int mid = scanner.nextInt();

        System.out.print("Enter your final score: ");
        int fiscore = scanner.nextInt()
;
        int totalscore = mid+fiscore;

        if (totalscore >= 50){
            System.out.println("Your total score is "+totalscore+ " The result is Pass!");
        }    else {
            System.out.println("Your total score is "+totalscore+ " The result is Fail!");
        }
    }
}