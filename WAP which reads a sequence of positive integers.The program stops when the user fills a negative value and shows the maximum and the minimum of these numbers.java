//WAP which reads a sequence of positive integers.The program stops when the user fills a negative value and shows the maximum and the minimum of these numbers.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       int max=n;
        int min=n;
       if(n>0) {
           while (true) {
               n = sc.nextInt();

               if (n < 0) {
                   break;
               }
               if (n > max) {
                   max = n;
               }
               if (n < min) {
                   min = n;
               }
           }
       }
        System.out.println("min="+min+" max="+max);
    }
}
