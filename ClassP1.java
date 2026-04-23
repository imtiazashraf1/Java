//Write a program using if-else statements that checks for two given lines by a user
//Whether the lines are equal. Also check whether the lines are equal if case-sensitivity is ignored.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first line: ");
        String line1 = sc.nextLine();

        System.out.print("Enter the second line: ");
        String line2 = sc.nextLine();

        if (line1.equals(line2)) {
            System.out.print("The lines are equal");
        }
   else {
       System.out.print("The lines are NOT equal");
        }
   if(line1.equalsIgnoreCase(line2)) {
       System.out.print("\nThe lines are equal");
   }
   else{
       System.out.print("The lines are NOT equal");
   }

    }
}
