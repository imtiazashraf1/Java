//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class Exam2 {
    public static int CalculateSumProduct(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {  // Check if the number is odd
                sum = sum + i;
            }
        }
       return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        //call the function and print the result
        System.out.println("The sum of all odd numbers is : "+CalculateSumProduct(n));
    }

}