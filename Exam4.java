//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class Exam3 {
    public static double CalculateCircumferenceofCircle(double radius){
        return 2* 3.14* radius;
    }
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        System.out.println("Circumference of this circle is: "+CalculateCircumferenceofCircle(r));
  }
}
