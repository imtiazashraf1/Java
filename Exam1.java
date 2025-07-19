//Enter 3 numbers from the user and make a function to print the average
import java.util.*;
public class Exam1 {
    public static int calculateAverage(int X, int Y, int Z){
        return (X+Y+X+Z)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

       System.out.println("Average is : "+calculateAverage(X,Y,Z));
    }
}
