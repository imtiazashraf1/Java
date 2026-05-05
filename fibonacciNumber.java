//WAP where the fibonacci sequence is a sequence of numbers where the 1st two numbers in the sequence are 1 and 1. Then, each additional fibonacci number is the sum of the two previous numbers in the sequence.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer n: ");
        int n = sc.nextInt();

        int result = 0;
        int n1=1;
        int n2=1;
        for (int i = 1; i <= n-2; i++) {
            result = n1+n2;
            n1=n2;
            n2=result;
        }
       System.out.println("result= "+(result==0? 1:result));
    }
}
