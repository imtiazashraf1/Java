//Print any numbers of factorial
import java.util.*;
public class Function1 {
    public static int PrintFactorial(int n) {
       //for 0
        if(n<=0){
            System.out.println("Invalid");
            return 0;
        }
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintFactorial(n);
    }
}
