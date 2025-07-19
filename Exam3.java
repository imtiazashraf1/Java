//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class Exam3 {
    public static int FindgreaterNumber(int a, int b) {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            System.out.println("The numbers are equal");
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.print("Grater number is : "+FindgreaterNumber(a,b));
    }
}
