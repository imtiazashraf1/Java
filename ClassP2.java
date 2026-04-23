//Write a class Grader that takes a numerical input between 0 and 100 and outputs the letter grade
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Please enter your number: ");
         int num = sc.nextInt();

         if(num>90){
             System.out.println("Grade= A");

         }
         else if(num>80){
             System.out.println("Grade=B");
         }
         else if(num>70){
             System.out.println("Grade=C");
         }
         else if(num>60){
             System.out.println("Grade=D");
         }
         else System.out.println("Grade=F");

    }
}
