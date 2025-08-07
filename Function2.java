//Make a function to multiply 2 numbers and return the product
import java.util.*;
public class Function1 {
    public static int CalculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product is : " + CalculateProduct(a, b));
    }
}
