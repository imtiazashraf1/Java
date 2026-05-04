//WAP which displays the sum of the strict divisors of an integer given by the user.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number: ");
              int number = sc.nextInt();

              int sum = 0;
              for(int i=1; i<=number/2; i++) {
                  if (number % i == 0) {
                      sum = sum + i;
                      System.out.println(i);
                  }
              }
              System.out.println("Sum: "+sum);
    }
}
